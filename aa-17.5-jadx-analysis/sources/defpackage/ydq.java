package defpackage;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class ydq extends yaq {
    final /* synthetic */ ydr a;
    private int b = -1;
    private final int c;

    public ydq(ydr ydrVar) {
        this.a = ydrVar;
        this.c = ((ylx) ydrVar.a()).d;
    }

    @Override // defpackage.yaq
    protected final /* synthetic */ Object a() {
        this.b++;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                b();
                return null;
            }
            ydr ydrVar = this.a;
            Object objB = ydrVar.b(i);
            int i2 = this.b;
            if (objB != null) {
                return new AbstractMap.SimpleImmutableEntry(((ylv) ydrVar.a().keySet()).a.get(i2), objB);
            }
            this.b = i2 + 1;
        }
    }
}
