package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Call;", "", "Factory", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Call extends Cloneable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Call$Factory;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Factory {
        RealCall a(Request request);
    }

    void B(Callback callback);

    void cancel();

    Response execute();

    /* renamed from: isCanceled */
    boolean getF42590o();

    /* renamed from: request */
    Request getF42578b();
}
