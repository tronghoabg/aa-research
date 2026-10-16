package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
final class dzt implements dzu {
    private final ContentInfo a;

    public dzt(ContentInfo contentInfo) {
        ebe.m(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.dzu
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.dzu
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.dzu
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.dzu
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
