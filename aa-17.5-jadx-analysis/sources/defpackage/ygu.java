package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public class ygu<K, V> extends ygm<K, V> implements ymf<K, V> {
    private static final long serialVersionUID = 0;
    private transient ygu a;
    private transient ygr b;
    private final transient ygr<V> emptySet;

    public ygu(yfy yfyVar, int i, Comparator comparator) {
        super(yfyVar, i);
        this.emptySet = comparator == null ? yly.a : yhc.F(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bp(i, "Invalid key count "));
        }
        yfu yfuVar = new yfu(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.bp(i4, "Invalid value count "));
            }
            ygp ygpVar = comparator == null ? new ygp() : new yha(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                ygpVar.c(object2);
            }
            ygr ygrVarH = ygpVar.g();
            if (ygrVarH.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            yfuVar.e(object, ygrVarH);
            i2 += i4;
        }
        try {
            this.a = new ygu(yfuVar.d(true), i2, comparator);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        ygu yguVar = this.a;
        yguVar.getClass();
        return yguVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ygr<V> ygrVar = this.emptySet;
        objectOutputStream.writeObject(ygrVar instanceof yhc ? ((yhc) ygrVar).a : null);
        ysi.g(this, objectOutputStream);
    }

    @Override // defpackage.ymf
    @Deprecated
    public final /* bridge */ /* synthetic */ Set E(Object obj) {
        throw null;
    }

    @Override // defpackage.ygm, defpackage.ybu, defpackage.yks
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ygr u() {
        ygr ygrVar = this.b;
        if (ygrVar != null) {
            return ygrVar;
        }
        ygt ygtVar = new ygt(this);
        this.b = ygtVar;
        return ygtVar;
    }

    @Override // defpackage.ymf
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Set u() {
        throw null;
    }

    @Override // defpackage.ymf
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Set c(Object obj) {
        throw null;
    }

    @Override // defpackage.ygm, defpackage.yks
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ygr c(Object obj) {
        return (ygr) woy.ap((ygr) this.map.get(obj), this.emptySet);
    }
}
