package com.google.d.d;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ed extends b {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    transient com.google.d.b.aj f7557a;

    ed(Map map, com.google.d.b.aj ajVar) {
        super(map);
        this.f7557a = ajVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f7557a = (com.google.d.b.aj) Objects.requireNonNull(objectInputStream.readObject());
        x((Map) Objects.requireNonNull(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f7557a);
        objectOutputStream.writeObject(p());
    }

    @Override // com.google.d.d.b, com.google.d.d.t
    final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.f7557a.get();
    }

    @Override // com.google.d.d.t, com.google.d.d.y
    final Map q() {
        return r();
    }

    @Override // com.google.d.d.t, com.google.d.d.y
    final Set s() {
        return t();
    }
}
