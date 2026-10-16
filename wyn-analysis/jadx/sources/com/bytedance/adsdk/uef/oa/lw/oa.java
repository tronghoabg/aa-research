package com.bytedance.adsdk.uef.oa.lw;

import com.bytedance.adsdk.uef.oa.moa.moa;
import com.bytedance.adsdk.uef.oa.moa.yo;
import com.bytedance.adsdk.uef.oa.oa.uef.bcc;
import com.bytedance.adsdk.uef.oa.oa.uef.bs;
import com.bytedance.adsdk.uef.oa.oa.uef.cq;
import com.bytedance.adsdk.uef.oa.oa.uef.cz;
import com.bytedance.adsdk.uef.oa.oa.uef.dj;
import com.bytedance.adsdk.uef.oa.oa.uef.dz;
import com.bytedance.adsdk.uef.oa.oa.uef.ivm;
import com.bytedance.adsdk.uef.oa.oa.uef.lw;
import com.bytedance.adsdk.uef.oa.oa.uef.oib;
import com.bytedance.adsdk.uef.oa.oa.uef.sy;
import com.bytedance.adsdk.uef.oa.oa.uef.wrv;
import com.unity3d.services.UnityAdsConstants;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class oa {

    /* renamed from: com.bytedance.adsdk.uef.oa.lw.oa$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[yo.values().length];
            uef = iArr;
            try {
                iArr[yo.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[yo.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[yo.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[yo.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[yo.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[yo.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uef[yo.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                uef[yo.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                uef[yo.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                uef[yo.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                uef[yo.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                uef[yo.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                uef[yo.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.uef.oa.oa.uef> oa(List<com.bytedance.adsdk.uef.oa.oa.uef> list, String str, int i5) {
        LinkedList<com.bytedance.adsdk.uef.oa.oa.uef> linkedList = new LinkedList(list);
        int i10 = 5;
        while (i10 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.uef.oa.oa.uef uefVar : linkedList) {
                if (!linkedList2.isEmpty() && yo.uef(((com.bytedance.adsdk.uef.oa.oa.uef) linkedList2.peekLast()).uef()) && ((yo) ((com.bytedance.adsdk.uef.oa.oa.uef) linkedList2.peekLast()).uef()).oa() == i10) {
                    com.bytedance.adsdk.uef.oa.oa.uef uefVar2 = (com.bytedance.adsdk.uef.oa.oa.uef) linkedList2.pollLast();
                    com.bytedance.adsdk.uef.oa.oa.uef uefVar3 = (com.bytedance.adsdk.uef.oa.oa.uef) linkedList2.pollLast();
                    if (yo.uef(uefVar3.uef()) || yo.uef(uefVar.uef())) {
                        throw new IllegalArgumentException(str.substring(0, i5));
                    }
                    linkedList2.addLast(uef(uefVar3, uefVar2, uefVar));
                } else {
                    linkedList2.addLast(uefVar);
                }
            }
            i10--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.uef.oa.oa.uef uef(List<com.bytedance.adsdk.uef.oa.oa.uef> list, String str, int i5) {
        yo(list, str, i5);
        Deque<com.bytedance.adsdk.uef.oa.oa.uef> dequeUef = uef(oa(list, str, i5));
        if (dequeUef.size() == 1) {
            return dequeUef.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void yo(List<com.bytedance.adsdk.uef.oa.oa.uef> list, String str, int i5) {
        Iterator<com.bytedance.adsdk.uef.oa.oa.uef> it = list.iterator();
        while (it.hasNext()) {
            if (moa.uef(it.next().uef())) {
                throw new IllegalArgumentException(str.substring(0, i5));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.uef.oa.oa.uef> uef(Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.uef.oa.oa.uef uefVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.uef.oa.oa.uef) linkedList.peekLast()).uef() == yo.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.uef.oa.oa.uef uefVar2 = (com.bytedance.adsdk.uef.oa.oa.uef) linkedList.pollLast();
                if (((com.bytedance.adsdk.uef.oa.oa.uef) linkedList.pollLast()).uef() == yo.QUESTION) {
                    com.bytedance.adsdk.uef.oa.oa.uef uefVar3 = (com.bytedance.adsdk.uef.oa.oa.uef) linkedList.pollLast();
                    oib oibVar = new oib();
                    oibVar.uef(uefVar3);
                    oibVar.oa(uefVar2);
                    oibVar.yo(uefVar);
                    linkedList.addLast(oibVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(uefVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.uef.oa.oa.uef uef(com.bytedance.adsdk.uef.oa.oa.uef uefVar, com.bytedance.adsdk.uef.oa.oa.uef uefVar2, com.bytedance.adsdk.uef.oa.oa.uef uefVar3) {
        bs djVar;
        switch (AnonymousClass1.uef[((yo) uefVar2.uef()).ordinal()]) {
            case 1:
                djVar = new dj();
                break;
            case 2:
                djVar = new sy();
                break;
            case 3:
                djVar = new com.bytedance.adsdk.uef.oa.oa.uef.uef();
                break;
            case 4:
                djVar = new cq();
                break;
            case 5:
                djVar = new wrv();
                break;
            case 6:
                djVar = new com.bytedance.adsdk.uef.oa.oa.uef.moa();
                break;
            case 7:
                djVar = new dz();
                break;
            case 8:
                djVar = new ivm();
                break;
            case 9:
                djVar = new cz();
                break;
            case 10:
                djVar = new lw();
                break;
            case 11:
                djVar = new bcc();
                break;
            case 12:
                djVar = new com.bytedance.adsdk.uef.oa.oa.uef.oa();
                break;
            case 13:
                djVar = new com.bytedance.adsdk.uef.oa.oa.uef.yo();
                break;
            default:
                throw new UnsupportedOperationException(uefVar2.uef().toString());
        }
        djVar.uef(uefVar);
        djVar.oa(uefVar3);
        return djVar;
    }

    public static boolean uef(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }
}
