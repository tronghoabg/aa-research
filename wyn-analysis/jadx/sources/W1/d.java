package W1;

import J9.C0656o;
import N1.C0754c;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f14951a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f14952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0656o f14953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0656o c0656o, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14953c = c0656o;
        this.f14951a = contentResolver;
        this.f14952b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        C0656o c0656o = this.f14953c;
        c0656o.g(b.b((Context) c0656o.f5962b, (C0754c) c0656o.f5970j, (Y9.c) c0656o.f5969i));
    }
}
