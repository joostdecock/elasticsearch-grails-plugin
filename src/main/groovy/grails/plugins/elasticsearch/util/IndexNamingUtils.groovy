package grails.plugins.elasticsearch.util

/**
 * Created by marcoscarceles on 16/05/2016.
 */
class IndexNamingUtils {

    public static final READ_SUFFIX = "_read"
    public static final WRITE_SUFFIX = "_write"
    public static final INDEX_PREFIX = "bookzone_"

    static String queryingIndexFor(String indexName) {
        INDEX_PREFIX + indexName + READ_SUFFIX
    }

    static String indexingIndexFor(String indexName) {
        INDEX_PREFIX + indexName + WRITE_SUFFIX
    }
}
