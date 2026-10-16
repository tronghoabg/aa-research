package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zon implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ znx b;
    final /* synthetic */ zoo c;
    final /* synthetic */ zop d;

    public zon(zop zopVar, CharSequence charSequence, znx znxVar, zoo zooVar) {
        this.a = charSequence;
        this.b = znxVar;
        this.c = zooVar;
        this.d = zopVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<zol> iterator() {
        return new zom(this.d, this.a, this.b, this.c);
    }
}
