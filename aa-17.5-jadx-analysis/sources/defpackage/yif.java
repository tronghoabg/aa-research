package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class yif extends ybu implements Serializable, yig {
    private static final long serialVersionUID = 0;
    public transient yic a;
    public transient yic b;
    public transient Map c;
    public transient int d;
    public transient int e;

    public yif(yks yksVar) {
        this(yksVar.x().size());
        B(yksVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = new yda();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            a(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Map.Entry entry : u()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.ybu, defpackage.yks
    public final boolean A() {
        return this.a == null;
    }

    @Override // defpackage.ybu, defpackage.yks
    public final /* bridge */ /* synthetic */ void D(Object obj, Iterable iterable) {
        throw null;
    }

    public final yic a(Object obj, Object obj2, yic yicVar) {
        yic yicVar2 = new yic(obj, obj2);
        if (this.a == null) {
            this.b = yicVar2;
            this.a = yicVar2;
            this.c.put(obj, new yib(yicVar2));
            this.e++;
        } else if (yicVar == null) {
            yic yicVar3 = this.b;
            yicVar3.getClass();
            yicVar3.a = yicVar2;
            yicVar2.b = yicVar3;
            this.b = yicVar2;
            yib yibVar = (yib) this.c.get(obj);
            if (yibVar == null) {
                this.c.put(obj, new yib(yicVar2));
                this.e++;
            } else {
                yibVar.a++;
                yic yicVar4 = (yic) yibVar.c;
                yicVar4.c = yicVar2;
                yicVar2.d = yicVar4;
                yibVar.c = yicVar2;
            }
        } else {
            yib yibVar2 = (yib) this.c.get(obj);
            yibVar2.getClass();
            yibVar2.a++;
            yicVar2.b = yicVar.b;
            yicVar2.d = yicVar.d;
            yicVar2.a = yicVar;
            yicVar2.c = yicVar;
            yic yicVar5 = yicVar.d;
            if (yicVar5 == null) {
                yibVar2.b = yicVar2;
            } else {
                yicVar5.c = yicVar2;
            }
            yic yicVar6 = yicVar.b;
            if (yicVar6 == null) {
                this.a = yicVar2;
            } else {
                yicVar6.a = yicVar2;
            }
            yicVar.b = yicVar2;
            yicVar.d = yicVar2;
        }
        this.d++;
        return yicVar2;
    }

    @Override // defpackage.ybu, defpackage.yks
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List u() {
        return (List) super.u();
    }

    @Override // defpackage.yks
    public final /* synthetic */ Collection c(Object obj) {
        return new yhv(this, obj);
    }

    public final void d(Object obj) {
        yrm.ac(new yie(this, obj));
    }

    public final void e(yic yicVar) {
        yic yicVar2 = yicVar.b;
        if (yicVar2 != null) {
            yicVar2.a = yicVar.a;
        } else {
            this.a = yicVar.a;
        }
        yic yicVar3 = yicVar.a;
        if (yicVar3 != null) {
            yicVar3.b = yicVar2;
        } else {
            this.b = yicVar2;
        }
        if (yicVar.d == null && yicVar.c == null) {
            yib yibVar = (yib) this.c.remove(yicVar.getKey());
            yibVar.getClass();
            yibVar.a = 0;
            this.e++;
        } else {
            yib yibVar2 = (yib) this.c.get(yicVar.getKey());
            yibVar2.getClass();
            yibVar2.a--;
            yic yicVar4 = yicVar.d;
            if (yicVar4 == null) {
                yic yicVar5 = yicVar.c;
                yicVar5.getClass();
                yibVar2.b = yicVar5;
            } else {
                yicVar4.c = yicVar.c;
            }
            yic yicVar6 = yicVar.c;
            if (yicVar6 == null) {
                yicVar4.getClass();
                yibVar2.c = yicVar4;
            } else {
                yicVar6.d = yicVar4;
            }
        }
        this.d--;
    }

    @Override // defpackage.yig
    /* renamed from: f */
    public final List c(Object obj) {
        return new yhv(this, obj);
    }

    @Override // defpackage.yig
    public final List g(Object obj) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(yrm.Q(new yie(this, obj)));
        d(obj);
        return listUnmodifiableList;
    }

    @Override // defpackage.yks
    public final int h() {
        return this.d;
    }

    @Override // defpackage.ybu
    public final /* synthetic */ Collection i() {
        return new yhw(this);
    }

    @Override // defpackage.ybu
    public final /* synthetic */ Collection j() {
        return new yhz(this);
    }

    @Override // defpackage.ybu
    public final Iterator l() {
        throw null;
    }

    @Override // defpackage.ybu
    public final Map o() {
        return new ykv(this);
    }

    @Override // defpackage.ybu
    public final Set p() {
        return new yhx(this);
    }

    @Override // defpackage.yks
    public final void q() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean s(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.ybu, defpackage.yks
    public final boolean t(Object obj, Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.ybu, defpackage.yks
    public final /* bridge */ /* synthetic */ Collection v() {
        throw null;
    }

    @Override // defpackage.ybu, defpackage.yks
    public final boolean z(Object obj) {
        throw null;
    }

    public yif(int i) {
        this.c = new ycx(i);
    }

    public yif() {
        throw null;
    }
}
