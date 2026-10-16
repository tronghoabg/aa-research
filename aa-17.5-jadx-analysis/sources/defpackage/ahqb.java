package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ahqb extends AbstractList implements RandomAccess, ahpb {
    private final ahpb list;

    public ahqb(ahpb ahpbVar) {
        this.list = ahpbVar;
    }

    @Override // defpackage.ahpb
    public void add(ahoa ahoaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.list.get(i);
    }

    @Override // defpackage.ahpb
    public ahoa getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // defpackage.ahpb
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new ahqa(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new ahpz(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // defpackage.ahpb
    public ahpb getUnmodifiableView() {
        return this;
    }
}
