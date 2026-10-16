package qg;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.RangeFetcher;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static InputStream a(RangeFetcher rangeFetcher, String str, long j8, long j10, Metadata metadata) {
        return rangeFetcher.fetch(str, j8, j10, metadata, new ParseContext());
    }
}
