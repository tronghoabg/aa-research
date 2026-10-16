package com.bytedance.adsdk.uef.oa.yo.uef;

import java.util.Deque;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class cz extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        com.bytedance.adsdk.uef.oa.oa.uef uefVarPollFirst;
        if (')' != uef(i5, str)) {
            return uefVar.uef(str, i5, deque);
        }
        LinkedList<com.bytedance.adsdk.uef.oa.oa.uef> linkedList = new LinkedList();
        while (true) {
            uefVarPollFirst = deque.pollFirst();
            if (uefVarPollFirst == null || uefVarPollFirst.uef() == com.bytedance.adsdk.uef.oa.moa.moa.LEFT_PAREN || ((uefVarPollFirst instanceof com.bytedance.adsdk.uef.oa.oa.uef.zjm) && uefVarPollFirst.uef() == com.bytedance.adsdk.uef.oa.moa.oa.METHOD && !((com.bytedance.adsdk.uef.oa.oa.uef.zjm) uefVarPollFirst).yo())) {
                break;
            }
            linkedList.addFirst(uefVarPollFirst);
        }
        if (uefVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i5));
        }
        if (uefVarPollFirst.uef() != com.bytedance.adsdk.uef.oa.moa.oa.METHOD) {
            deque.push(com.bytedance.adsdk.uef.oa.lw.oa.uef(linkedList, str, i5));
            return i5 + 1;
        }
        com.bytedance.adsdk.uef.oa.oa.uef.zjm zjmVar = (com.bytedance.adsdk.uef.oa.oa.uef.zjm) uefVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.uef.oa.oa.uef uefVar2 : linkedList) {
            if (uefVar2.uef() == com.bytedance.adsdk.uef.oa.moa.moa.COMMA) {
                linkedList2.add(com.bytedance.adsdk.uef.oa.lw.oa.uef(linkedList3, str, i5));
                linkedList3.clear();
            } else {
                linkedList3.addLast(uefVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.uef.oa.lw.oa.uef(linkedList3, str, i5));
        }
        zjmVar.uef((com.bytedance.adsdk.uef.oa.oa.uef[]) linkedList2.toArray(new com.bytedance.adsdk.uef.oa.oa.uef[linkedList2.size()]));
        zjmVar.uef(true);
        int i10 = i5 + 1;
        deque.push(zjmVar);
        return i10;
    }
}
