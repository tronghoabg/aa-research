package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class gjt implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gjt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.b) {
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

    /* JADX WARN: Type inference failed for: r9v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v74, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        lpv lpvVar = null;
        int i = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return this.a.invoke(obj);
            case 1:
                return this.a.invoke(obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                xha xhaVar = (xha) obj;
                defpackage.yqm yqmVar = defpackage.ike.a;
                xhk xhkVar = xhaVar.c;
                if (xhkVar == null) {
                    xhkVar = xhk.f;
                }
                com.google.android.gms.car.control.CarAreaId carAreaIdA = com.google.android.gms.car.control.CarAreaId.a(xhkVar);
                xhr xhrVar = xhaVar.e;
                if (xhrVar == null) {
                    xhrVar = xhr.a;
                }
                java.lang.Class cls = (java.lang.Class) this.a;
                java.lang.Object objG = defpackage.ike.g(xhrVar, cls);
                xhr xhrVar2 = xhaVar.d;
                if (xhrVar2 == null) {
                    xhrVar2 = xhr.a;
                }
                return new com.google.android.gms.car.control.CarAreaIdConfig(carAreaIdA, objG, defpackage.ike.g(xhrVar2, cls));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return j$.util.Collection.-EL.stream(((defpackage.ike) this.a).h((com.google.android.gms.car.control.CarControlGroup) obj));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.ikz) this.a).j((xnx) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.rqx) this.a).c((defpackage.yzd) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.display.integratedoverlay.OverlayParameters overlayParameters = (com.google.android.gms.car.display.integratedoverlay.OverlayParameters) obj;
                int i2 = overlayParameters.a;
                float f = ((defpackage.ivn) this.a).c.l;
                android.graphics.Rect rect = overlayParameters.b;
                defpackage.yhx yhxVar = defpackage.ivs.a;
                android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                double d = f;
                if (d < 1.0d) {
                    rect2.top = java.lang.Math.round(rect.top * f);
                    rect2.bottom = java.lang.Math.round(rect.bottom * f);
                } else if (d > 1.0d) {
                    rect2.left = java.lang.Math.round(rect.left / f);
                    rect2.right = java.lang.Math.round(rect.right / f);
                }
                return new com.google.android.gms.car.display.integratedoverlay.OverlayParameters(i2, rect2, overlayParameters.c);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.iyg iygVar = (defpackage.iyg) obj;
                return j$.util.Collection.-EL.stream(((defpackage.iyh) this.a).b(iygVar.a, iygVar.b));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String str = (java.lang.String) obj;
                java.util.List listI = iyq.a.i(str);
                if (listI.size() != 2) {
                    ((defpackage.yqj) ((defpackage.yqj) iyq.b.h()).ai((char) 1639)).y("Invalid flag entry for trusted 3p installer [%s]", str);
                    return null;
                }
                java.lang.Object obj2 = this.a;
                java.lang.String str2 = (java.lang.String) listI.get(0);
                if (iyp.a((android.content.pm.PackageManager) obj2, str2, (java.lang.String) listI.get(1))) {
                    return str2;
                }
                return null;
            case 9:
                return this.a.invoke(obj);
            case 10:
                return this.a.invoke(obj);
            case 11:
                return ((jse) this.a).a((android.util.Pair) obj);
            case 12:
                mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) obj;
                int i3 = jxy.a;
                su suVar = new su();
                suVar.b = androidx.car.app.model.CarText.create(message.b);
                suVar.e = message.f;
                suVar.c = message.c;
                suVar.d = message.d;
                suVar.a = jxy.b(message.e);
                suVar.f = ((lum) this.a).f;
                java.lang.String str3 = suVar.c;
                if ((str3 == null) ^ (suVar.d == null)) {
                    throw new java.lang.IllegalStateException("Incomplete multimedia data detected in CarMessage. Please be sure to provide both MIME type and URI for multimedia messages.");
                }
                if (suVar.b == null && str3 == null) {
                    throw new java.lang.IllegalStateException("Message must have content. Please provide body text, multimedia data (URI + MIME type), or both.");
                }
                return new androidx.car.app.messaging.model.CarMessage(suVar);
            case 13:
                return new kor((java.lang.Enum) this.a);
            case 14:
                return new kor((java.lang.Enum) this.a);
            case 15:
                kqo kqoVar = (kqo) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                kqoVar.getClass();
                j$.util.Optional optionalFindFirst = stream.filter(new defpackage.koo(kqoVar, 6)).findFirst();
                if (kqoVar.a.isPresent() || optionalFindFirst.isEmpty()) {
                    return kqoVar;
                }
                kqn kqnVar = new kqn(kqoVar);
                kqnVar.c(((kqo) optionalFindFirst.get()).a);
                return kqnVar.a();
            case 16:
                lac lacVar = new lac(0);
                java.lang.String str4 = ((ota) obj).c;
                defpackage.ysr.aY(!str4.isEmpty(), "Only Icons with URIs are supported for icon spans interleaved with text");
                android.net.Uri uri = android.net.Uri.parse(str4);
                boolean zEquals = "android.resource".equals(uri.getScheme());
                java.lang.Object obj3 = this.a;
                if (!zEquals) {
                    return new ocj((android.content.Context) obj3, uri);
                }
                java.lang.String strC = defpackage.kzi.c(uri);
                try {
                    return new ocj(((android.content.Context) obj3).createPackageContext(strC, 0), defpackage.kzi.b(uri, lacVar, (android.content.Context) obj3));
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalArgumentException("Context not found for ".concat(strC), e);
                }
            case 17:
                return new lnx((lny) this.a, (java.lang.String) obj);
            case 18:
                return ((defpackage.lpg) this.a).h((android.content.ComponentName) obj);
            case 19:
                return new low(((defpackage.lpg) this.a).b, (android.content.ComponentName) obj).a();
            default:
                lmi lmiVar = (lmi) obj;
                ?? r9 = this.a;
                android.content.ComponentName componentNameA = defpackage.lpx.a(lmiVar);
                if (!defpackage.lpx.k()) {
                    return (defpackage.eqp) j$.util.Map.-EL.computeIfAbsent((java.util.Map) r9, componentNameA, new defpackage.lpk(lmiVar, i));
                }
                defpackage.eqp eqpVar = (defpackage.eqp) r9.get(componentNameA);
                if (eqpVar != null) {
                    return eqpVar;
                }
                try {
                    lmiVar.P();
                    lpvVar = new lpv(lmiVar);
                } catch (java.lang.SecurityException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lpx.a.h()).p(e2)).ai((char) 4161)).y("SecurityException when trying to create MediaSessionStateLiveData for %s", lmiVar.R());
                }
                if (lpvVar != null) {
                    r9.put(componentNameA, lpvVar);
                }
                return lpvVar;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.b) {
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
