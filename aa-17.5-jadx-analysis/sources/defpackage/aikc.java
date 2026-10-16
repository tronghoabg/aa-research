package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aikc {
    public static final Object a(long j, afeg afegVar, afck afckVar) {
        return d(new aiwm(j, afckVar), afegVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(long r7, defpackage.afeg r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.aiwn
            if (r0 == 0) goto L13
            r0 = r10
            aiwn r0 = (defpackage.aiwn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aiwn r0 = new aiwn
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            affv r7 = r0.c
            defpackage.woy.dF(r10)     // Catch: defpackage.aiwl -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.woy.dF(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            affv r10 = new affv
            r10.<init>()
            r0.c = r10     // Catch: defpackage.aiwl -> L56
            r0.b = r4     // Catch: defpackage.aiwl -> L56
            aiwm r2 = new aiwm     // Catch: defpackage.aiwl -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.aiwl -> L56
            r10.a = r2     // Catch: defpackage.aiwl -> L56
            java.lang.Object r7 = d(r2, r9)     // Catch: defpackage.aiwl -> L56
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            aivh r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikc.b(long, afeg, afck):java.lang.Object");
    }

    public static final Object c(long j, afeg afegVar, afck afckVar) {
        return b(aiow.a(j), afegVar, afckVar);
    }

    private static final List<aiin> captureArguments(aijf aijfVar, ailq ailqVar) {
        if (aijfVar.getArguments().size() != aijfVar.getConstructor().getParameters().size()) {
            return null;
        }
        List<aiin> arguments = aijfVar.getArguments();
        if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((aiin) it.next()).getProjectionKind() != aijg.INVARIANT) {
                    List<agee> parameters = aijfVar.getConstructor().getParameters();
                    parameters.getClass();
                    List<aezu> listCi = woy.ci(arguments, parameters);
                    ArrayList arrayList = new ArrayList(woy.bp(listCi, 10));
                    for (aezu aezuVar : listCi) {
                        aiin aiinVarAsTypeProjection = (aiin) aezuVar.a;
                        agee ageeVar = (agee) aezuVar.b;
                        if (aiinVarAsTypeProjection.getProjectionKind() != aijg.INVARIANT) {
                            aijf aijfVarUnwrap = (aiinVarAsTypeProjection.isStarProjection() || aiinVarAsTypeProjection.getProjectionKind() != aijg.IN_VARIANCE) ? null : aiinVarAsTypeProjection.getType().unwrap();
                            ageeVar.getClass();
                            aiinVarAsTypeProjection = aimr.asTypeProjection(new aijw(ailqVar, aijfVarUnwrap, aiinVarAsTypeProjection, ageeVar));
                        }
                        arrayList.add(aiinVarAsTypeProjection);
                    }
                    aiiy aiiyVarBuildSubstitutor = aiig.Companion.create(aijfVar.getConstructor(), arrayList).buildSubstitutor();
                    int size = arguments.size();
                    for (int i = 0; i < size; i++) {
                        aiin aiinVar = arguments.get(i);
                        aiin aiinVar2 = (aiin) arrayList.get(i);
                        if (aiinVar.getProjectionKind() != aijg.INVARIANT) {
                            List<aigl> upperBounds = aijfVar.getConstructor().getParameters().get(i).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(aijq.INSTANCE.prepareType((ailw) aiiyVarBuildSubstitutor.safeSubstitute((aigl) it2.next(), aijg.INVARIANT).unwrap()));
                            }
                            if (!aiinVar.isStarProjection() && aiinVar.getProjectionKind() == aijg.OUT_VARIANCE) {
                                arrayList2.add(aijq.INSTANCE.prepareType((ailw) aiinVar.getType().unwrap()));
                            }
                            aigl type = aiinVar2.getType();
                            type.getClass();
                            ((aijw) type).getConstructor().initializeSupertypes(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final aigw captureFromArguments(aigw aigwVar, ailq ailqVar) {
        aigwVar.getClass();
        ailqVar.getClass();
        List<aiin> listCaptureArguments = captureArguments(aigwVar, ailqVar);
        if (listCaptureArguments != null) {
            return replaceArguments(aigwVar, listCaptureArguments);
        }
        return null;
    }

    private static final Object d(aiwm aiwmVar, afeg afegVar) {
        affx.c(aiwmVar, true, new aiuq(aiow.e(aiwmVar.c.hH()).h(aiwmVar.b, aiwmVar, ((aisz) aiwmVar).a)));
        return afus.b(aiwmVar, false, aiwmVar, afegVar);
    }

    private static final aigw replaceArguments(aijf aijfVar, List<? extends aiin> list) {
        return aigq.simpleType$default(aijfVar.getAttributes(), aijfVar.getConstructor(), list, aijfVar.isMarkedNullable(), (aiju) null, 16, (Object) null);
    }
}
