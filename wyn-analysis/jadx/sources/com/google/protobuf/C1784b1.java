package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.protobuf.b1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1784b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f27649b = new B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f27650a;

    public C1784b1(int i5) {
        InterfaceC1802h1 interfaceC1802h1;
        switch (i5) {
            case 1:
                this.f27650a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC1802h1 = (InterfaceC1802h1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    interfaceC1802h1 = f27649b;
                }
                InterfaceC1802h1[] interfaceC1802h1Arr = {B0.f27520b, interfaceC1802h1};
                C1781a1 c1781a1 = new C1781a1();
                c1781a1.f27647a = interfaceC1802h1Arr;
                this.f27650a = (InterfaceC1802h1) Internal.checkNotNull(c1781a1, "messageInfoFactory");
                break;
        }
    }

    public void a(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof C1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
            C1 c12 = (C1) byteString;
            a(c12.f27532b);
            a(c12.f27533c);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C1.f27530f, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iA = C1.a(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f27650a;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iA) {
            arrayDeque.push(byteString);
            return;
        }
        int iA2 = C1.a(iBinarySearch);
        ByteString c13 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iA2) {
            c13 = new C1((ByteString) arrayDeque.pop(), c13);
        }
        C1 c14 = new C1(c13, byteString);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C1.f27530f, c14.f27531a);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= C1.a(iBinarySearch2 + 1)) {
                break;
            } else {
                c14 = new C1((ByteString) arrayDeque.pop(), c14);
            }
        }
        arrayDeque.push(c14);
    }
}
