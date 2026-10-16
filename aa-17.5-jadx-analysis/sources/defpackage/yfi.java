package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yfi<K extends Enum<K>, V> extends yfw<K, V> {
    private final transient EnumMap a;

    public yfi(EnumMap enumMap) {
        this.a = enumMap;
        if (enumMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public static yfy a(EnumMap enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ylx.a;
        }
        if (size != 1) {
            return new yfi(enumMap);
        }
        Map.Entry entry = (Map.Entry) yrm.Y(enumMap.entrySet().iterator());
        return yfy.k((Enum) entry.getKey(), entry.getValue());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yfy, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yfw
    public final yno e() {
        return new yki(this.a.entrySet().iterator());
    }

    @Override // defpackage.yfy, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfi) {
            obj = ((yfi) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.yfy
    public final yno gS() {
        return yrm.X(this.a.keySet().iterator());
    }

    @Override // defpackage.yfy, java.util.Map
    public final V get(Object obj) {
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yfw, defpackage.yfy
    public Object writeReplace() {
        return new yfh(this.a);
    }
}
