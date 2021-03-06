// Copyright 2014 Square, Inc.

/**
 * Retrofit turns your REST API into a Java interface.
 * <pre>
 * public interface GitHubService {
 *   &#64;GET("/users/{user}/repos")
 *   List<Repo> listRepos(@Path("user") String user);
 * }
 * </pre>
 */
package retrofit;
