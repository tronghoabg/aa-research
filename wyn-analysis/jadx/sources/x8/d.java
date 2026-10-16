package x8;

import A7.I0;
import java.util.HashSet;
import java.util.Iterator;
import l8.AbstractC3414P;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4498a {

    /* renamed from: a, reason: collision with root package name */
    public HashSet f47857a;

    /* renamed from: b, reason: collision with root package name */
    public w8.b f47858b;

    @Override // x8.InterfaceC4498a
    public final void a(HashSet hashSet) {
        HashSet hashSet2 = this.f47857a;
        hashSet2.clear();
        HashSet hashSet3 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet3.size() >= 50) {
                break;
            }
            AbstractC3414P abstractC3414P = AbstractC4499b.f47849a;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (Character.isLetter(iCodePointAt) || iCodePointAt == 95) {
                    int length = str.length();
                    int iCharCount = Character.charCount(iCodePointAt);
                    while (true) {
                        if (iCharCount < length) {
                            int iCodePointAt2 = str.codePointAt(iCharCount);
                            if (iCodePointAt2 == 95 || Character.isLetterOrDigit(iCodePointAt2)) {
                                iCharCount += Character.charCount(iCodePointAt2);
                            }
                        } else if (str.length() != 0) {
                            int iCodePointAt3 = str.codePointAt(0);
                            if (Character.isLetter(iCodePointAt3)) {
                                int length2 = str.length();
                                int iCharCount2 = Character.charCount(iCodePointAt3);
                                while (true) {
                                    if (iCharCount2 >= length2) {
                                        String strC = I0.c(str, I0.f523a, I0.f525c);
                                        if (strC != null) {
                                            str = strC;
                                        }
                                        hashSet3.add(str);
                                    } else {
                                        int iCodePointAt4 = str.codePointAt(iCharCount2);
                                        if (iCodePointAt4 == 95 || Character.isLetterOrDigit(iCodePointAt4)) {
                                            iCharCount2 += Character.charCount(iCodePointAt4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hashSet2.addAll(hashSet3);
    }
}
