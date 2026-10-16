package S;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public abstract class d implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final o[] f10802a;

    /* renamed from: b, reason: collision with root package name */
    public int f10803b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10804c = true;

    public d(n nVar, o[] oVarArr) {
        this.f10802a = oVarArr;
        oVarArr[0].a(nVar.f10828d, Integer.bitCount(nVar.f10825a) * 2, 0);
        this.f10803b = 0;
        a();
    }

    public final void a() {
        int i5 = this.f10803b;
        o[] oVarArr = this.f10802a;
        o oVar = oVarArr[i5];
        if (oVar.f10831c < oVar.f10830b) {
            return;
        }
        while (-1 < i5) {
            int iC = c(i5);
            if (iC == -1) {
                o oVar2 = oVarArr[i5];
                int i10 = oVar2.f10831c;
                Object[] objArr = oVar2.f10829a;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f10831c = i10 + 1;
                    iC = c(i5);
                }
            }
            if (iC != -1) {
                this.f10803b = iC;
                return;
            }
            if (i5 > 0) {
                o oVar3 = oVarArr[i5 - 1];
                int i11 = oVar3.f10831c;
                int length2 = oVar3.f10829a.length;
                oVar3.f10831c = i11 + 1;
            }
            oVarArr[i5].a(n.f10824e.f10828d, 0, 0);
            i5--;
        }
        this.f10804c = false;
    }

    public final int c(int i5) {
        o[] oVarArr = this.f10802a;
        o oVar = oVarArr[i5];
        int i10 = oVar.f10831c;
        if (i10 < oVar.f10830b) {
            return i5;
        }
        Object[] objArr = oVar.f10829a;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        n nVar = (n) obj;
        if (i5 == 6) {
            o oVar2 = oVarArr[i5 + 1];
            Object[] objArr2 = nVar.f10828d;
            oVar2.a(objArr2, objArr2.length, 0);
        } else {
            oVarArr[i5 + 1].a(nVar.f10828d, Integer.bitCount(nVar.f10825a) * 2, 0);
        }
        return c(i5 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10804c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f10804c) {
            throw new NoSuchElementException();
        }
        Object next = this.f10802a[this.f10803b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
