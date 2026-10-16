package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dsx {
    static boolean a(android.app.Notification.Action action) {
        return a$.ExternalSyntheticApiModelOutline0.m(action);
    }

    public static int b(android.app.Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static defpackage.dta c(android.app.Notification notification, int i) {
        dut[] dutVarArr;
        int iH;
        int i2;
        android.app.Notification.Action action = notification.actions[i];
        android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
        androidx.core.graphics.drawable.IconCompat iconCompatD = null;
        if (remoteInputs == null) {
            dutVarArr = null;
        } else {
            dut[] dutVarArr2 = new dut[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                android.app.RemoteInput remoteInput = remoteInputs[i3];
                dutVarArr2[i3] = new dut(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? alh$.ExternalSyntheticApiModelOutline0.m(remoteInput) : 0, remoteInput.getExtras(), (java.util.Set) null);
            }
            dutVarArr = dutVarArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || a$.ExternalSyntheticApiModelOutline2.m(action);
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int iM = hh$.ExternalSyntheticApiModelOutline0.m(action);
        boolean zM = android.os.Build.VERSION.SDK_INT >= 29 ? alh$.ExternalSyntheticApiModelOutline0.m(action) : false;
        if (android.os.Build.VERSION.SDK_INT >= 37) {
            iH = dsy.h(action);
            i2 = dsy.i(action);
        } else {
            iH = 0;
            i2 = 0;
        }
        boolean zA = android.os.Build.VERSION.SDK_INT >= 31 ? a(action) : false;
        if (action.getIcon() == null && action.icon != 0) {
            return new defpackage.dta(action.icon, action.title, action.actionIntent, action.getExtras(), dutVarArr, z, iM, z2, zM, iH, i2, zA);
        }
        if (action.getIcon() != null) {
            android.graphics.drawable.Icon icon = action.getIcon();
            if (defpackage.dtr.d(icon) != 2 || defpackage.dtr.c(icon) != 0) {
                iconCompatD = defpackage.dtq.d(icon);
            }
        }
        return new defpackage.dta(iconCompatD, action.title, action.actionIntent, action.getExtras(), dutVarArr, z, iM, z2, zM, iH, i2, zA);
    }

    static java.lang.Object d(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Callable callable, int i) throws java.lang.InterruptedException {
        try {
            return executorService.submit(callable).get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.InterruptedException("timeout");
        }
    }

    public static /* synthetic */ java.lang.String e(int i) {
        if (i == 1) {
            return "NOT_REQUIRED";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i == 3) {
            return "UNMETERED";
        }
        if (i != 4) {
            return i != 5 ? "TEMPORARILY_UNMETERED" : "METERED";
        }
        return "NOT_ROAMING";
    }

    public static void f(defpackage.dbc dbcVar, java.lang.String str, java.util.concurrent.Executor executor, defpackage.afer aferVar) {
        executor.getClass();
        defpackage.dlv.n(new fka(executor, aferVar, new defpackage.eqs(fjz.b), 0));
    }

    public static android.graphics.Typeface g(android.content.Context context, java.util.List list, int i, boolean z, int i2, android.os.Handler handler, defpackage.ebl eblVar) {
        se seVar = new se(eblVar, new dwu(handler, 0));
        java.lang.Object obj = null;
        if (!z) {
            java.lang.String strA = dwr.a(list, i);
            android.graphics.Typeface typeface = (android.graphics.Typeface) dwr.a.b(strA);
            if (typeface != null) {
                seVar.r(new acku(typeface));
                obj = typeface;
            } else {
                dwq dwqVar = new dwq(seVar, 1);
                synchronized (dwr.c) {
                    defpackage.aba abaVar = dwr.d;
                    java.util.ArrayList arrayList = (java.util.ArrayList) abaVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(dwqVar);
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(dwqVar);
                        abaVar.put(strA, arrayList2);
                        dwp dwpVar = new dwp(strA, context, list, i);
                        dwr.b.execute(new hqu(android.os.Looper.myLooper() == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : new android.os.Handler(), dwpVar, new dwq(strA, 0), 1));
                    }
                }
            }
        } else {
            if (list.size() > 1) {
                throw new java.lang.IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            defpackage.dwn dwnVar = (defpackage.dwn) list.get(0);
            defpackage.aab aabVar = dwr.a;
            java.lang.String strA2 = dwr.a(duf.e(dwnVar), i);
            android.graphics.Typeface typeface2 = (android.graphics.Typeface) dwr.a.b(strA2);
            if (typeface2 != null) {
                seVar.r(new acku(typeface2));
                obj = typeface2;
            } else if (i2 == -1) {
                acku ackuVarB = dwr.b(strA2, context, duf.e(dwnVar), i);
                seVar.r(ackuVarB);
                obj = ackuVarB.b;
            } else {
                try {
                    acku ackuVar = (acku) d(dwr.b, new dwo(strA2, context, dwnVar, i), i2);
                    seVar.r(ackuVar);
                    obj = ackuVar.b;
                } catch (java.lang.InterruptedException unused) {
                    seVar.r(new acku(-3, (byte[]) null, (byte[]) null));
                }
            }
        }
        return (android.graphics.Typeface) obj;
    }
}
