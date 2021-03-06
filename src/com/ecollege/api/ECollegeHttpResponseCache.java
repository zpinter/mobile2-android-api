package com.ecollege.api;


public interface ECollegeHttpResponseCache {

	/**
	 * FileCacheEntry is an object which contains cached data and metadata about it
	 *  
	 */
	
	public class CacheEntry {
		public String data;
		public long cachedAt;
		
		public CacheEntry(String data, long cachedAt) {
			super();
			this.data = data;
			this.cachedAt = cachedAt;
		}
	}

	public CacheEntry get(String cacheKey);
	public void put(String cacheKey, String responseContent);

}
