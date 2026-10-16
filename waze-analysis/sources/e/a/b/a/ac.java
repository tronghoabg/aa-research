package e.a.b.a;

import android.os.Parcelable;
import e.a.ce;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements ce {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable.Creator f46307a;

    public ac(Parcelable.Creator creator) {
        this.f46307a = creator;
    }

    @Override // e.a.ce
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new al(this.f46307a, (Parcelable) obj);
    }

    @Override // e.a.ce
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (inputStream instanceof al) {
            return ((al) inputStream).b();
        }
        throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
    }
}
