package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vap implements java.util.function.Function {
    private final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return ((vam) obj).b();
            case 1:
                return ((vam) obj).a().o;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ajhv ajhvVar = (ajhv) obj;
                return new vqc(ajhvVar, vqd.c(ajhvVar.c == 3 ? (ajia) ajhvVar.d : ajia.a));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return vqd.d((ajgq) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ajhv ajhvVar2 = (ajhv) obj;
                return new vqc(ajhvVar2, vqd.d(ajhvVar2.c == 1 ? (ajgq) ajhvVar2.d : ajgq.a));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return vqd.c((ajia) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((vqe) obj).b();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ajgq ajgqVar = (ajgq) obj;
                return java.lang.String.format("%s [%s]", java.lang.Long.valueOf(ajgqVar.b), ajgqVar.c);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ajgq ajgqVar2 = (ajgq) obj;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(java.lang.String.format("Trace ID: %s\n", java.lang.Long.valueOf(ajgqVar2.b)));
                sb.append(java.lang.String.format("Trace Name: %s\n", ajgqVar2.c));
                sb.append(java.lang.String.format("Edge Count: %s\n", java.lang.Integer.valueOf(ajgqVar2.f.size())));
                for (ajgp ajgpVar : ajgqVar2.d) {
                    int iAo = defpackage.a.ao(ajgpVar.d);
                    if (iAo == 0) {
                        iAo = 1;
                    }
                    if (iAo == 3) {
                        sb.append(java.lang.String.format("Dapper URL: http://go/trace/0x%X\n", java.lang.Long.valueOf(ajgpVar.b == 2 ? ((java.lang.Long) ajgpVar.c).longValue() : 0L)));
                    }
                }
                return sb.toString().trim();
            case 9:
                ajhv ajhvVar3 = (ajhv) obj;
                return ajhvVar3.c == 1 ? (ajgq) ajhvVar3.d : ajgq.a;
            case 10:
                ajhv ajhvVar4 = (ajhv) obj;
                return ajhvVar4.c == 3 ? (ajia) ajhvVar4.d : ajia.a;
            case 11:
                ajia ajiaVar = (ajia) obj;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(java.lang.String.format("Trace ID: %s\n", java.lang.Long.valueOf(ajiaVar.b)));
                sb2.append(java.lang.String.format("Trace Name: %s\n", vyf.i(ajiaVar)));
                sb2.append(java.lang.String.format("Span Count: %s\n", java.lang.Integer.valueOf(ajiaVar.c.size())));
                java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList();
                for (ajhz ajhzVar : ajiaVar.c) {
                    if ((ajhzVar.b & 2048) != 0) {
                        arrayList.add(java.lang.Long.valueOf(ajhzVar.g));
                    }
                }
                for (java.lang.Long l : arrayList) {
                    l.longValue();
                    sb2.append(java.lang.String.format("Dapper URL: http://go/trace/0x%X\n", l));
                }
                return sb2.toString().trim();
            case 12:
                ajia ajiaVar2 = (ajia) obj;
                return java.lang.String.format("%s [%s]", java.lang.Long.valueOf(ajiaVar2.b), vyf.i(ajiaVar2));
            case 13:
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.reflect.Method method = wfn.a;
                try {
                    java.lang.String str3 = (java.lang.String) wfn.a.invoke(null, str2, null);
                    if (!"".equals(str3)) {
                        str = str3;
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.e("SystemProperties", "get error", e);
                }
                return str != null ? str : "";
            case 14:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                defpackage.yqm yqmVar = com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity.m;
                return new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
            case 15:
                return ((android.content.ComponentName) obj).flattenToShortString();
            case 16:
                com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity launcherAppSettingsActivity = (com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity) obj;
                defpackage.yqm yqmVar2 = com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity.m;
                launcherAppSettingsActivity.getClass();
                defpackage.rco rcoVar = launcherAppSettingsActivity.s;
                launcherAppSettingsActivity.getClass();
                return defpackage.omv.b(launcherAppSettingsActivity, rcoVar, new xab(launcherAppSettingsActivity, 2), null, 0);
            case 17:
                return ((mrd) obj).c.a();
            case 18:
                return ((defpackage.jfh) obj).e;
            case 19:
                return ((defpackage.ygx) obj).a();
            default:
                return ((java.util.Map.Entry) obj).getKey();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
