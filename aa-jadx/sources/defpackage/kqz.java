package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kqz extends defpackage.mdl {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        j$.util.Optional optionalOf;
        if (j$.util.Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE")) {
            if (!intent.getBooleanExtra("android.hardware.usb.extra.ACCESSORY_START", true)) {
                if (defpackage.acpv.x()) {
                    defpackage.omv.j(context, defpackage.yyn.USB_TRIGGER_ACCESSORY_CANCELLED, intent.getIntExtra("android.hardware.usb.extra.ACCESSORY_STRING_COUNT", -1));
                } else {
                    defpackage.omv.i(context, defpackage.yyn.USB_TRIGGER_ACCESSORY_CANCELLED);
                }
            }
            if (defpackage.acpv.x() && intent.getBooleanExtra("android.hardware.usb.extra.ACCESSORY_START", false)) {
                defpackage.omv.j(context, defpackage.yyn.USB_TRIGGER_ACCESSORY_ACCEPTED, intent.getIntExtra("android.hardware.usb.extra.ACCESSORY_STRING_COUNT", -1));
                return;
            }
            return;
        }
        if (j$.util.Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_STATE")) {
            boolean booleanExtra = intent.getBooleanExtra("connected", false);
            switch ((booleanExtra ? 1 : 0) | (true != intent.getBooleanExtra("configured", false) ? (char) 0 : (char) 2) | (true == intent.getBooleanExtra("accessory", false) ? 4 : 0)) {
                case 0:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_NONE);
                    break;
                case 1:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONNECTED);
                    break;
                case 2:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONFIGURED);
                    optionalOf.isPresent();
                    optionalOf.get();
                    if (defpackage.acpv.v()) {
                        optionalOf = j$.util.Optional.empty();
                    }
                    break;
                case 3:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONNECTED_CONFIGURED);
                    break;
                case 4:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_ACCESSORY);
                    break;
                case 5:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONNECTED_ACCESSORY);
                    break;
                case 6:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONFIGURED_ACCESSORY);
                    optionalOf.isPresent();
                    optionalOf.get();
                    if (defpackage.acpv.u()) {
                        optionalOf = j$.util.Optional.empty();
                    }
                    break;
                default:
                    optionalOf = j$.util.Optional.of(defpackage.yyn.USB_TRIGGER_CONNECTED_CONFIGURED_ACCESSORY);
                    break;
            }
            defpackage.jgh jghVar = new defpackage.jgh(context, 11);
            if (true == optionalOf.isPresent()) {
                java.lang.Object obj = optionalOf.get();
                android.content.Context context2 = (android.content.Context) jghVar.a;
                if (j$.util.Objects.equals(new defpackage.ldu(context2, defpackage.jrj.a, "car").b(), java.lang.Boolean.TRUE)) {
                    return;
                }
                defpackage.omv.i(context2, (defpackage.yyn) obj);
            }
        }
    }
}
