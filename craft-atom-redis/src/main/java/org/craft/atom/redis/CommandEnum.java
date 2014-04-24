package org.craft.atom.redis;

/**
 * Redis command name enum.
 * 
 * @author mindwind
 * @version 1.0, Jun 19, 2013
 */
public enum CommandEnum {
	
	
	// ~ -------------------------------------------------------------------------------------------------------- Keys
	
	
	DEL,
	DUMP,
	EXISTS,
	EXPIRE,
	EXPIREAT,
	KEYS,
	MIGRATE,
	MOVE,
	OBJECT_REFCOUNT,
	OBJECT_ENCODING,
	OBJECT_IDLETIME,
	PERSIST,
	PEXPIRE,
	PEXPIREAT,
	PTTL,
	RANDOMKEY,
	RENAME,
	RENAMENX,
	RESTORE,
	SORT,
	SORT_DESC,
	SORT_ALPHA_DESC,
	SORT_OFFSET_COUNT,
	SORT_OFFSET_COUNT_ALPHA_DESC,
	SORT_BY_GET,
	SORT_BY_DESC_GET,
	SORT_BY_ALPHA_DESC_GET,
	SORT_BY_OFFSET_COUNT_GET,
	SORT_BY_OFFSET_COUNT_ALPHA_DESC_GET,
	SORT_DESTINATION,
	SORT_DESC_DESTINATION,
	SORT_ALPHA_DESC_DESTINATION,
	SORT_OFFSET_COUNT_DESTINATION,
	SORT_OFFSET_COUNT_ALPHA_DESC_DESTINATION,
	SORT_BY_DESTINATION_GET,
	SORT_BY_DESC_DESTINATION_GET,
	SORT_BY_ALPHA_DESC_DESTINATION_GET,
	SORT_BY_OFFSET_COUNT_DESTINATION_GET,
	SORT_BY_OFFSET_COUNT_ALPHA_DESC_DESTINATION_GET,
	TTL,
	TYPE,
	SCAN,
	SCAN_COUNT,
	SCAN_MATCH,
	SCAN_MATCH_COUNT,
	
	
	// ~ ------------------------------------------------------------------------------------------------------ Strings
	
	
	APPEND,
	BITCOUNT,
	BITCOUNT_START_END,
	BITNOT,
	BITAND,
	BITOR,
	BITXOR,
	DECR,
	DECRBY,
	GET,
	GETBIT,
	GETRANGE,
	GETSET,
	INCR,
	INCRBY,
	INCRBYFLOAT,
	MGET,
	MSET,
	MSETNX,
	PSETEX,
	SET,
	SETXX,
	SETNXEX,
	SETNXPX,
	SETXXEX,
	SETXXPX,
	SETBIT,
	SETEX,
	SETNX,
	SETRANGE,
	STRLEN,
	
	
	// ~ ------------------------------------------------------------------------------------------------------ Hashes
	
	
	HDEL,
	HEXISTS,
	HGET,
	HGETALL,
	HINCRBY,
	HINCRBYFLOAT,
	HKEYS,
	HLEN,
	HMGET,
	HMSET,
	HSET,
	HSETNX,
	HVALS,
	
	
	// ~ ------------------------------------------------------------------------------------------------------- Lists
	
	
	BLPOP,
	BRPOP,
	BRPOPLPUSH,
	LINDEX,
	LINSERT_BEFORE,
	LINSERT_AFTER,
	LLEN,
	LPOP,
	LPUSH,
	LPUSHX,
	LRANGE,
	LREM,
	LSET,
	LTRIM,
	RPOP,
	RPOPLPUSH,
	RPUSH,
	RPUSHX,
	
	
	// ~ ------------------------------------------------------------------------------------------------------- Sets
	
	
	SADD,
	SCARD,
	SDIFF,
	SDIFFSTORE,
	SINTER,
	SINTERSTORE,
	SISMEMBER,
	SMEMBERS,
	SMOVE,
	SPOP,
	SRANDMEMBER,
	SRANDMEMBER_COUNT,
	SREM,
	SUNION,
	SUNIONSTORE,
	
	
	// ~ ------------------------------------------------------------------------------------------------- Sorted Sets
	
	
	ZADD,
	ZCARD,
	ZCOUNT,
	ZCOUNT_STRING,
	ZINCRBY,
	ZINTERSTORE,
	ZINTERSTORE_MAX,
	ZINTERSTORE_MIN,
	ZINTERSTORE_WEIGHTS,
	ZINTERSTORE_WEIGHTS_MAX,
	ZINTERSTORE_WEIGHTS_MIN,
	ZRANGE,
	ZRANGE_WITHSCORES,
	ZRANGEBYSCORE,
	ZRANGEBYSCORE_STRING,
	ZRANGEBYSCORE_OFFSET_COUNT,
	ZRANGEBYSCORE_OFFSET_COUNT_STRING,
	ZRANGEBYSCORE_WITHSCORES,
	ZRANGEBYSCORE_WITHSCORES_STRING,
	ZRANGEBYSCORE_WITHSCORES_OFFSET_COUNT,
	ZRANGEBYSCORE_WITHSCORES_OFFSET_COUNT_STRING,
	ZRANK,
	ZREM,
	ZREMRANGEBYRANK,
	ZREMRANGEBYSCORE,
	ZREMRANGEBYSCORE_STRING,
	ZREVRANGE,
	ZREVRANGE_WITHSCORES,
	ZREVRANGEBYSCORE,
	ZREVRANGEBYSCORE_STRING,
	ZREVRANGEBYSCORE_OFFSET_COUNT,
	ZREVRANGEBYSCORE_OFFSET_COUNT_STRING,
	ZREVRANGEBYSCORE_WITHSCORES,
	ZREVRANGEBYSCORE_WITHSCORES_STRING,
	ZREVRANGEBYSCORE_WITHSCORES_OFFSET_COUNT,
	ZREVRANGEBYSCORE_WITHSCORES_OFFSET_COUNT_STRING,
	ZREVRANK,
	ZSCORE,
	ZUNIONSTORE,
	ZUNIONSTORE_MAX,
	ZUNIONSTORE_MIN,
	ZUNIONSTORE_WEIGHTS,
	ZUNIONSTORE_WEIGHTS_MAX,
	ZUNIONSTORE_WEIGHTS_MIN,
	
	
	// ~ ----------------------------------------------------------------------------------------------------- Pub/Sub
	
	
	PSUBSCRIBE,
	PUBLISH,
	PUNSUBSCRIBE,
	SUBSCRIBE,
	UNSUBSCRIBE,
	
	
	// ~ ------------------------------------------------------------------------------------------------ Transactions
	
	
	DISCARD,
	EXEC,
	MULTI,
	UNWATCH,
	WATCH,
	
	
	// ~ --------------------------------------------------------------------------------------------------- Scripting
	
	
	EVAL,
	EVALSHA,
	SCRIPT_EXISTS,
	SCRIPT_FLUSH,
	SCRIPT_KILL,
	SCRIPT_LOAD,
	
	
	// ~ ------------------------------------------------------------------------------------------------- Connection
	
	
	AUTH,
	ECHO,
	PING,
	QUIT,
	SELECT,
	
	
	// ~ ------------------------------------------------------------------------------------------------------ Server
	
	
	BGREWRITEAOF,
	BGSAVE,
	CLIENT_KILL,
	CLIENT_LIST,
	CLIENT_GETNAME,
	CLIENT_SETNAME,
	CONFIG_GET,
	CONFIG_SET,
	CONFIG_RESETSTAT,
	DBSIZE,
	DEBUG_OBJECT,
	DEBUG_SEGFAULT,
	FLUSH_ALL,
	FLUSH_DB,
	INFO,
	LAST_SAVE,
	MONITOR,
	SAVE,
	SHUTDOWN,
	SLAVEOF,
	SLAVEOF_NONOE,
	SLOWLOG_LEN,
	SLOWLOG_GET,
	SLOWLOG_GET_LEN,
	SLOWLOG_RESET,
	SYNC,
	TIME, 
	TIME_MICRO
	
}
