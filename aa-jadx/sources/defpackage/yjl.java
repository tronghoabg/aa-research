package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjl extends defpackage.yda implements java.io.Serializable, defpackage.yjm {
    private static final long serialVersionUID = 0;
    public transient defpackage.yji a;
    public transient defpackage.yji b;
    public transient java.util.Map c;
    public transient int d;
    public transient int e;

    public yjl(defpackage.ylx ylxVar) {
        this(ylxVar.x().size());
        B(ylxVar);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.c = new defpackage.yeg();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            a(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (java.util.Map.Entry entry : u()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.yda, defpackage.ylx
    public final boolean A() {
        return this.a == null;
    }

    @Override // defpackage.yda, defpackage.ylx
    public final /* bridge */ /* synthetic */ void D(java.lang.Object obj, java.lang.Iterable iterable) {
        throw null;
    }

    public final defpackage.yji a(java.lang.Object obj, java.lang.Object obj2, defpackage.yji yjiVar) {
        defpackage.yji yjiVar2 = new defpackage.yji(obj, obj2);
        if (this.a == null) {
            this.b = yjiVar2;
            this.a = yjiVar2;
            this.c.put(obj, new defpackage.yjh(yjiVar2));
            this.e++;
        } else if (yjiVar == null) {
            defpackage.yji yjiVar3 = this.b;
            yjiVar3.getClass();
            yjiVar3.a = yjiVar2;
            yjiVar2.b = yjiVar3;
            this.b = yjiVar2;
            defpackage.yjh yjhVar = (defpackage.yjh) this.c.get(obj);
            if (yjhVar == null) {
                this.c.put(obj, new defpackage.yjh(yjiVar2));
                this.e++;
            } else {
                yjhVar.a++;
                defpackage.yji yjiVar4 = (defpackage.yji) yjhVar.c;
                yjiVar4.c = yjiVar2;
                yjiVar2.d = yjiVar4;
                yjhVar.c = yjiVar2;
            }
        } else {
            defpackage.yjh yjhVar2 = (defpackage.yjh) this.c.get(obj);
            yjhVar2.getClass();
            yjhVar2.a++;
            yjiVar2.b = yjiVar.b;
            yjiVar2.d = yjiVar.d;
            yjiVar2.a = yjiVar;
            yjiVar2.c = yjiVar;
            defpackage.yji yjiVar5 = yjiVar.d;
            if (yjiVar5 == null) {
                yjhVar2.b = yjiVar2;
            } else {
                yjiVar5.c = yjiVar2;
            }
            defpackage.yji yjiVar6 = yjiVar.b;
            if (yjiVar6 == null) {
                this.a = yjiVar2;
            } else {
                yjiVar6.a = yjiVar2;
            }
            yjiVar.b = yjiVar2;
            yjiVar.d = yjiVar2;
        }
        this.d++;
        return yjiVar2;
    }

    @Override // defpackage.yda, defpackage.ylx
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.util.List u() {
        return (java.util.List) super.u();
    }

    @Override // defpackage.ylx
    public final /* synthetic */ java.util.Collection c(java.lang.Object obj) {
        return new defpackage.yjb(this, obj);
    }

    public final void d(java.lang.Object obj) {
        defpackage.ysr.ac(new defpackage.yjk(this, obj));
    }

    public final void e(defpackage.yji yjiVar) {
        defpackage.yji yjiVar2 = yjiVar.b;
        if (yjiVar2 != null) {
            yjiVar2.a = yjiVar.a;
        } else {
            this.a = yjiVar.a;
        }
        defpackage.yji yjiVar3 = yjiVar.a;
        if (yjiVar3 != null) {
            yjiVar3.b = yjiVar2;
        } else {
            this.b = yjiVar2;
        }
        if (yjiVar.d == null && yjiVar.c == null) {
            defpackage.yjh yjhVar = (defpackage.yjh) this.c.remove(yjiVar.getKey());
            yjhVar.getClass();
            yjhVar.a = 0;
            this.e++;
        } else {
            defpackage.yjh yjhVar2 = (defpackage.yjh) this.c.get(yjiVar.getKey());
            yjhVar2.getClass();
            yjhVar2.a--;
            defpackage.yji yjiVar4 = yjiVar.d;
            if (yjiVar4 == null) {
                defpackage.yji yjiVar5 = yjiVar.c;
                yjiVar5.getClass();
                yjhVar2.b = yjiVar5;
            } else {
                yjiVar4.c = yjiVar.c;
            }
            defpackage.yji yjiVar6 = yjiVar.c;
            if (yjiVar6 == null) {
                yjiVar4.getClass();
                yjhVar2.c = yjiVar4;
            } else {
                yjiVar6.d = yjiVar4;
            }
        }
        this.d--;
    }

    @Override // defpackage.yjm
    /* JADX INFO: renamed from: f */
    public final java.util.List c(java.lang.Object obj) {
        return new defpackage.yjb(this, obj);
    }

    @Override // defpackage.yjm
    public final java.util.List g(java.lang.Object obj) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(defpackage.ysr.Q(new defpackage.yjk(this, obj)));
        d(obj);
        return listUnmodifiableList;
    }

    @Override // defpackage.ylx
    public final int h() {
        return this.d;
    }

    @Override // defpackage.yda
    public final /* synthetic */ java.util.Collection i() {
        return new defpackage.yjc(this);
    }

    @Override // defpackage.yda
    public final /* synthetic */ java.util.Collection j() {
        return new defpackage.yjf(this);
    }

    @Override // defpackage.yda
    public final java.util.Iterator l() {
        throw null;
    }

    @Override // defpackage.yda
    public final java.util.Map o() {
        return new defpackage.yma(this);
    }

    @Override // defpackage.yda
    public final java.util.Set p() {
        return new defpackage.yjd(this);
    }

    @Override // defpackage.ylx
    public final void q() {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean s(java.lang.Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.yda, defpackage.ylx
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.yda, defpackage.ylx
    public final /* bridge */ /* synthetic */ java.util.Collection v() {
        throw null;
    }

    @Override // defpackage.yda, defpackage.ylx
    public final boolean z(java.lang.Object obj) {
        throw null;
    }

    public yjl(int i) {
        this.c = new defpackage.yed(i);
    }

    public yjl() {
        throw null;
    }
}
