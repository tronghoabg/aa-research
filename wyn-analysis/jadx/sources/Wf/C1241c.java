package Wf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1241c extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15579b;

    /* renamed from: c, reason: collision with root package name */
    public final L f15580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241c(KSerializer eSerializer, int i5) {
        super(eSerializer);
        this.f15579b = i5;
        switch (i5) {
            case 1:
                AbstractC3340k.e(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                AbstractC3340k.e(elementDesc, "elementDesc");
                this.f15580c = new C1239b(elementDesc, 2);
                break;
            case 2:
                AbstractC3340k.e(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                AbstractC3340k.e(elementDesc2, "elementDesc");
                this.f15580c = new C1239b(elementDesc2, 3);
                break;
            default:
                AbstractC3340k.e(eSerializer, "element");
                SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                AbstractC3340k.e(elementDesc3, "elementDesc");
                this.f15580c = new C1239b(elementDesc3, 1);
                break;
        }
    }

    @Override // Wf.AbstractC1237a
    public final Object a() {
        switch (this.f15579b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // Wf.AbstractC1237a
    public final int b(Object obj) {
        switch (this.f15579b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3340k.e(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3340k.e(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3340k.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // Wf.AbstractC1237a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC3340k.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC3340k.e(collection, "<this>");
        return collection.size();
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        switch (this.f15579b) {
            case 0:
                AbstractC3340k.e(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                AbstractC3340k.e(null, "<this>");
                return new HashSet((Collection) null);
            default:
                AbstractC3340k.e(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f15579b) {
        }
        return (C1239b) this.f15580c;
    }

    @Override // Wf.AbstractC1237a
    public final Object h(Object obj) {
        switch (this.f15579b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3340k.e(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3340k.e(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3340k.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // Wf.r
    public final void i(int i5, Object obj, Object obj2) {
        switch (this.f15579b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3340k.e(arrayList, "<this>");
                arrayList.add(i5, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3340k.e(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3340k.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
