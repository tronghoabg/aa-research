package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ahpa extends AbstractList implements RandomAccess, ahpb {
    public static final ahpb EMPTY = new ahpa().getUnmodifiableView();
    private final List<Object> list;

    public ahpa(ahpb ahpbVar) {
        this.list = new ArrayList(ahpbVar.size());
        addAll(ahpbVar);
    }

    private static ahoa asByteString(Object obj) {
        return obj instanceof ahoa ? (ahoa) obj : obj instanceof String ? ahoa.copyFromUtf8((String) obj) : ahoa.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ahoa ? ((ahoa) obj).toStringUtf8() : ahot.toStringUtf8((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        this.list.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof ahpb) {
            collection = ((ahpb) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.list.clear();
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ahoa) {
            ahoa ahoaVar = (ahoa) obj;
            String stringUtf8 = ahoaVar.toStringUtf8();
            if (ahoaVar.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = ahot.toStringUtf8(bArr);
        if (ahot.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // defpackage.ahpb
    public ahoa getByteString(int i) {
        Object obj = this.list.get(i);
        ahoa ahoaVarAsByteString = asByteString(obj);
        if (ahoaVarAsByteString != obj) {
            this.list.set(i, ahoaVarAsByteString);
        }
        return ahoaVarAsByteString;
    }

    @Override // defpackage.ahpb
    public List<?> getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.list);
    }

    @Override // defpackage.ahpb
    public ahpb getUnmodifiableView() {
        return new ahqb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        Object objRemove = this.list.remove(i);
        this.modCount++;
        return asString(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return asString(this.list.set(i, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // defpackage.ahpb
    public void add(ahoa ahoaVar) {
        this.list.add(ahoaVar);
        this.modCount++;
    }

    public ahpa() {
        this.list = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
