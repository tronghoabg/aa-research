package defpackage;

import android.os.FileObserver;

/* loaded from: classes3.dex */
public final class wzs extends FileObserver {
    final /* synthetic */ wzt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzs(wzt wztVar, String str) {
        super(str, 520);
        this.a = wztVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        int i2 = wzt.d;
        this.a.a();
    }
}
