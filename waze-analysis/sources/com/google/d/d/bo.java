package com.google.d.d;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class bo<K, V> extends ca<K, V> implements dc<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private transient bo f7457a;

    bo(bs bsVar, int i2) {
        super(bsVar, i2);
    }

    public static bo b() {
        return az.f7443a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Invalid key count " + i2);
        }
        bq bqVar = new bq();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object objRequireNonNull = Objects.requireNonNull(objectInputStream.readObject());
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i5);
            }
            int i6 = bn.f7456d;
            bi biVar = new bi();
            for (int i7 = 0; i7 < i5; i7++) {
                biVar.g(Objects.requireNonNull(objectInputStream.readObject()));
            }
            bqVar.d(objRequireNonNull, biVar.f());
            i3 += i5;
        }
        try {
            this.f7457a = new bo(bqVar.b(), i3);
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private Object readResolve() {
        return Objects.requireNonNull(this.f7457a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        fo.p(this, objectOutputStream);
    }

    @Override // com.google.d.d.dc
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bn g(Object obj) {
        bn bnVar = (bn) this.map.get(obj);
        if (bnVar != null) {
            return bnVar;
        }
        int i2 = bn.f7456d;
        return es.f7582a;
    }

    @Override // com.google.d.d.ca, com.google.d.d.dw
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw null;
    }
}
