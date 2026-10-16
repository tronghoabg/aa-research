package m1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f40305a;

    public f(Object obj) {
        this.f40305a = (InputContentInfo) obj;
    }

    @Override // m1.g
    public final Object a() {
        return this.f40305a;
    }

    @Override // m1.g
    public final Uri b() {
        return this.f40305a.getContentUri();
    }

    @Override // m1.g
    public final void g() {
        this.f40305a.requestPermission();
    }

    @Override // m1.g
    public final ClipDescription getDescription() {
        return this.f40305a.getDescription();
    }

    @Override // m1.g
    public final Uri j() {
        return this.f40305a.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f40305a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
