package com.prototype.user.impl;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.prototype.user.User;

import java.util.HashMap;
import java.util.Map;
/**
 * Very simple Rest.li Resource that serves up a fortune cookie.
 */
@RestLiCollection(name = "users", namespace = "com.prototype.user")
public class UsersResource extends CollectionResourceTemplate<Long, User>
{
    // Create trivial db for fortunes
    static Map<Long, String> fortunes = new HashMap<Long, String>();
    static {
        fortunes.put(1L, "Today is your lucky day.");
        fortunes.put(2L, "There's no time like the present.");
        fortunes.put(3L, "Don't worry, be happy.");
    }

    @Override
    public User get(Long key)
    {
        // Retrieve the requested fortune
        String fortune = fortunes.get(key);
        if(fortune == null)
            fortune = "Your luck has run out. No fortune for id="+key;

        // return an object that represents the fortune cookie
        return new User().setUsername(fortune);
    }
}

