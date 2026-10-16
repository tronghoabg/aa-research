package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agpk {
    public static final agpa<agnq> classBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpc
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnq) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnq) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final agpa<agnw> constructorBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpd
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnw) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnw) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final agpa<agog> functionBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpe
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agog) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agog) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final <Node> agpb<Node, agow> memberKindDelegate(afhm<Node, Integer> afhmVar) {
        afhmVar.getClass();
        ahkz<ahih> ahkzVar = ahla.MEMBER_KIND;
        ahkzVar.getClass();
        afdf<agow> entries = agow.getEntries();
        afdf<agow> entries2 = agow.getEntries();
        ArrayList arrayList = new ArrayList(woy.bp(entries2, 10));
        Iterator<agow> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$org_jetbrains_kotlin_kotlin_metadata());
        }
        return new agpb<>(afhmVar, ahkzVar, entries, arrayList);
    }

    public static final <Node> agpb<Node, agox> modalityDelegate(afhm<Node, Integer> afhmVar) {
        afhmVar.getClass();
        ahkz<ahij> ahkzVar = ahla.MODALITY;
        ahkzVar.getClass();
        afdf<agox> entries = agox.getEntries();
        afdf<agox> entries2 = agox.getEntries();
        ArrayList arrayList = new ArrayList(woy.bp(entries2, 10));
        Iterator<agox> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$org_jetbrains_kotlin_kotlin_metadata());
        }
        return new agpb<>(afhmVar, ahkzVar, entries, arrayList);
    }

    public static final agpa<agok> propertyAccessorBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpf
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agok) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agok) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final agpa<agoj> propertyBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpg
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoj) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoj) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final <Node> agpb<Node, agoy> returnValueStatusDelegate(afhm<Node, Integer> afhmVar, ahkz<? extends ahor> ahkzVar) {
        afhmVar.getClass();
        ahkzVar.getClass();
        afdf<agoy> entries = agoy.getEntries();
        afdf<agoy> entries2 = agoy.getEntries();
        ArrayList arrayList = new ArrayList(woy.bp(entries2, 10));
        Iterator<agoy> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(new agpl(ahkzVar, it.next().ordinal()));
        }
        return new agpb<>(afhmVar, ahkzVar, entries, arrayList);
    }

    public static final agpa<agom> typeAliasBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agph
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agom) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agom) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final agpa<agol> typeBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpi
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agol) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agol) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final agpa<agoq> valueParameterBooleanFlag(agpl agplVar) {
        agplVar.getClass();
        return new agpa<>(new affh() { // from class: agpj
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoq) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoq) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, agplVar);
    }

    public static final <Node> agpb<Node, agoz> visibilityDelegate(afhm<Node, Integer> afhmVar) {
        afhmVar.getClass();
        ahkz<ahkn> ahkzVar = ahla.VISIBILITY;
        ahkzVar.getClass();
        afdf<agoz> entries = agoz.getEntries();
        afdf<agoz> entries2 = agoz.getEntries();
        ArrayList arrayList = new ArrayList(woy.bp(entries2, 10));
        Iterator<agoz> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$org_jetbrains_kotlin_kotlin_metadata());
        }
        return new agpb<>(afhmVar, ahkzVar, entries, arrayList);
    }
}
