package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class ykw extends yby {
    private static final long serialVersionUID = 0;
    transient xyc c;

    public ykw(Map map, xyc xycVar) {
        super(map);
        this.c = xycVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.c = (xyc) object;
        Object object2 = objectInputStream.readObject();
        object2.getClass();
        r((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((ybm) this).a);
    }

    @Override // defpackage.yby, defpackage.ybm
    public final /* bridge */ /* synthetic */ Collection a() {
        return (Set) this.c.gu();
    }

    @Override // defpackage.yby, defpackage.ybm
    public final Collection d(Collection collection) {
        return collection instanceof NavigableSet ? yrm.s((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.yby, defpackage.ybm
    public final Collection e(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new ybj(this, obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new ybl(this, obj, (SortedSet) collection, null) : new ybk(this, obj, (Set) collection);
    }

    @Override // defpackage.ybm, defpackage.ybu
    public final Map o() {
        Map map = ((ybm) this).a;
        return map instanceof NavigableMap ? new yba(this, (NavigableMap) map) : map instanceof SortedMap ? new ybd(this, (SortedMap) map) : new yaw(this, map);
    }

    @Override // defpackage.ybm, defpackage.ybu
    public final Set p() {
        Map map = ((ybm) this).a;
        return map instanceof NavigableMap ? new ybb(this, (NavigableMap) map) : map instanceof SortedMap ? new ybe(this, (SortedMap) map) : new yaz(this, map);
    }
}
