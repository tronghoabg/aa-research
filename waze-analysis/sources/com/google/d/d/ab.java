package com.google.d.d;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab<K, V> extends b<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    transient int f7404a;

    private ab() {
        super(new ao(12));
        fo.ah(3, "expectedValuesPerKey");
        this.f7404a = 3;
    }

    public static ab I() {
        return new ab();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f7404a = 3;
        int i2 = objectInputStream.readInt();
        x(new ao());
        for (int i3 = 0; i3 < i2; i3++) {
            List listG = g(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                listG.add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        fo.p(this, objectOutputStream);
    }

    @Override // com.google.d.d.b, com.google.d.d.t
    final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.f7404a);
    }
}
