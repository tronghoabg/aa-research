package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class afd implements bym {
    public Object a;
    public Object b;
    public aec c;
    public afy d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ afh h;
    public final bii i;
    private final bwq j;

    public afd(afh afhVar, Object obj, Object obj2, bii biiVar, aec aecVar) {
        this.h = afhVar;
        this.a = obj;
        this.b = obj2;
        this.i = biiVar;
        this.j = new ParcelableSnapshotMutableState(obj, bxp.c);
        this.c = aecVar;
        this.d = new afy(this.c, biiVar, this.a, this.b, null);
    }

    @Override // defpackage.bym
    public final Object a() {
        return this.j.a();
    }

    public final void b(Object obj) {
        this.j.b(obj);
    }
}
