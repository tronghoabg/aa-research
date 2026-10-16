package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jxj implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jxj(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.c) {
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
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, sdt] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        dur sender;
        int i = 1;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return ((jxk) this.a).e((defpackage.qsh) this.b, (defpackage.nze) obj);
            case 1:
                defpackage.jva jvaVar = (defpackage.jva) this.a;
                java.util.List listC = defpackage.mkc.b().c((defpackage.qsh) this.b, new defpackage.nzf(jvaVar.b, defpackage.qqe.h, (defpackage.nze) obj));
                defpackage.yqm yqmVar = defpackage.jva.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 2775)).y("Raw list of template calling apps found: %s", listC);
                java.util.Iterator it = j$.util.Collection.-EL.stream(defpackage.jva.m(listC, defpackage.adae.c())).map(new defpackage.ikc(20)).iterator();
                int i2 = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                ygrVar.l(it);
                defpackage.ygw ygwVarG = ygrVar.g();
                if (!jvaVar.c) {
                    defpackage.rrv rrvVarA = defpackage.kag.a(defpackage.zbd.sP);
                    rrvVarA.q((java.util.Collection) j$.util.Collection.-EL.stream(ygwVarG).map(new defpackage.jvi(i)).collect(defpackage.yds.a));
                    defpackage.kag.e(rrvVarA);
                    ((defpackage.yqj) yqmVar.l().ai((char) 2776)).y("Template calling apps found: %s", ygwVarG);
                    jvaVar.c = true;
                }
                return ygwVarG;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                androidx.car.app.messaging.model.CarMessage carMessage = (androidx.car.app.messaging.model.CarMessage) obj;
                int i3 = jxy.a;
                mesquite.messaging.model.Message.Builder builder = new mesquite.messaging.model.Message.Builder();
                builder.b("fake ID");
                if (carMessage.getSender() == null) {
                    sender = ((androidx.car.app.messaging.model.ConversationItem) this.a).getSelf();
                } else {
                    sender = carMessage.getSender();
                    sender.getClass();
                }
                java.lang.Object obj2 = this.b;
                builder.a = sender;
                hmi hmiVarL = ((gfa) obj2).l(hmi.class);
                hmiVarL.getClass();
                builder.b = hmiVarL.a(carMessage);
                builder.c = carMessage.getReceivedTimeEpochMillis();
                builder.d = carMessage.getMultimediaMimeType();
                builder.e = carMessage.getMultimediaUri();
                return builder.a();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj3 = this.a;
                defpackage.yqm yqmVar2 = defpackage.jyw.a;
                return defpackage.jyw.b((android.content.Context) obj3, ((android.service.notification.StatusBarNotification) this.b).getPackageName(), (android.app.Notification.Action) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.Handler handler = ((defpackage.kou) this.a).e;
                pby pbyVar = (pby) this.b;
                pbt pbtVar = pbyVar.c == 11 ? (pbt) pbyVar.d : pbt.a;
                defpackage.abpj abpjVar = (pbtVar.b == 3 ? (pbq) pbtVar.c : pbq.a).b;
                pbt pbtVar2 = pbyVar.c == 11 ? (pbt) pbyVar.d : pbt.a;
                return new koq(handler, abpjVar, (pbtVar2.b == 3 ? (pbq) pbtVar2.c : pbq.a).c);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.kou kouVar = (defpackage.kou) this.a;
                return new kot(kouVar.g, (pby) this.b, kouVar.d);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
                int i4 = true != new ozp((android.content.Context) this.a, (defpackage.sdt) this.b).f(bluetoothDevice, false) ? 1 : 2;
                kqn kqnVarA = kqo.a();
                kqnVarA.d = j$.util.Optional.of(bluetoothDevice);
                kqnVarA.e(i4);
                return kqnVarA.a();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str = (java.lang.String) this.b;
                boolean zContains = str.contains("content://com.android.contacts/contacts");
                java.lang.Object obj4 = this.a;
                if (zContains) {
                    try {
                        java.io.InputStream inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(((laa) obj4).b.getContentResolver(), android.net.Uri.parse(str.replaceFirst("/photo", "")));
                        try {
                            inputStreamOpenContactPhotoInputStream.getClass();
                            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconN = com.google.android.apps.auto.components.graphics.icon.GhIcon.n(android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream));
                            inputStreamOpenContactPhotoInputStream.close();
                            return ghIconN;
                        } catch (java.lang.Throwable th) {
                            if (inputStreamOpenContactPhotoInputStream != null) {
                                try {
                                    inputStreamOpenContactPhotoInputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) laa.a.h()).p(e)).ai((char) 3668)).u("Cannot open contacts uri");
                    }
                }
                android.net.Uri uri = android.net.Uri.parse(str);
                if ("android.resource".equals(uri.getScheme())) {
                    laa laaVar = (laa) obj4;
                    return com.google.android.apps.auto.components.graphics.icon.GhIcon.r(defpackage.kzi.c(uri), defpackage.kzi.b(uri, laaVar.c, laaVar.b));
                }
                if (uri == null) {
                    throw new java.lang.IllegalArgumentException("Uri must not be null.");
                }
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(4);
                ghIcon.f = uri.toString();
                return ghIcon;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                lok lokVar = new lok(defpackage.lor.b, ((defpackage.lpg) this.b).g((android.content.ComponentName) obj), (lmi) this.a);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai(4130)).M("Fetching new connection %s %s", java.lang.Integer.toHexString(java.lang.System.identityHashCode(lokVar)), lokVar);
                return lokVar;
            case 9:
                android.telephony.SmsMessage smsMessage = (android.telephony.SmsMessage) obj;
                int i5 = defpackage.lvh.c;
                long timestampMillis = smsMessage.getTimestampMillis();
                mesquite.messaging.model.Message.Builder builder2 = new mesquite.messaging.model.Message.Builder();
                builder2.a = (dur) this.a;
                builder2.b(java.lang.String.valueOf(j$.util.Objects.hash(new java.lang.Object[]{this.b, java.lang.Long.valueOf(timestampMillis)})));
                builder2.b = smsMessage.getMessageBody();
                builder2.c = timestampMillis;
                return builder2.a();
            case 10:
                return new nbh((defpackage.mib) ((mkb) this.a).b.a, new mka((java.lang.String) this.b));
            case 11:
                defpackage.nti ntiVar = (defpackage.nti) obj;
                int iOrdinal = ntiVar.ordinal();
                if (iOrdinal == 0) {
                    return new defpackage.nsb(new inr(this.a, 9));
                }
                if (iOrdinal == 4) {
                    return new nsi();
                }
                if (iOrdinal == 5) {
                    return new nsg();
                }
                if (iOrdinal == 6 || iOrdinal == 7) {
                    return ((defpackage.ntb) this.b).H() ? new nsf() : new nsh();
                }
                throw new java.lang.IllegalStateException("Unexpected layout type for primary display ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ntiVar))));
            default:
                android.view.View view = (android.view.View) obj;
                view.getRootView().setOnTouchListener(new jzx(this.a, 8, (byte[]) null));
                android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                java.lang.Object obj5 = this.b;
                valueAnimatorOfFloat.addUpdateListener(new oda(obj5, view, 0));
                valueAnimatorOfFloat.addListener(new odf((odj) obj5, view));
                valueAnimatorOfFloat.start();
                return java.lang.Boolean.FALSE;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.c) {
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
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ jxj(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
