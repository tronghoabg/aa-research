package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Objects;
import j$.util.Optional;

/* loaded from: classes2.dex */
public abstract class kqs extends mdd {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        Optional optionalOf;
        if (Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE")) {
            if (!intent.getBooleanExtra("android.hardware.usb.extra.ACCESSORY_START", true)) {
                if (acot.x()) {
                    ols.N(context, yxi.USB_TRIGGER_ACCESSORY_CANCELLED, intent.getIntExtra("android.hardware.usb.extra.ACCESSORY_STRING_COUNT", -1));
                } else {
                    ols.M(context, yxi.USB_TRIGGER_ACCESSORY_CANCELLED);
                }
            }
            if (acot.x() && intent.getBooleanExtra("android.hardware.usb.extra.ACCESSORY_START", false)) {
                ols.N(context, yxi.USB_TRIGGER_ACCESSORY_ACCEPTED, intent.getIntExtra("android.hardware.usb.extra.ACCESSORY_STRING_COUNT", -1));
                return;
            }
            return;
        }
        if (Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_STATE")) {
            boolean booleanExtra = intent.getBooleanExtra("connected", false);
            switch ((booleanExtra ? 1 : 0) | (true != intent.getBooleanExtra("configured", false) ? (char) 0 : (char) 2) | (true == intent.getBooleanExtra("accessory", false) ? (char) 4 : (char) 0)) {
                case false:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_NONE);
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONNECTED);
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONFIGURED);
                    optionalOf.isPresent();
                    optionalOf.get();
                    if (acot.v()) {
                        optionalOf = Optional.empty();
                        break;
                    }
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONNECTED_CONFIGURED);
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_ACCESSORY);
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONNECTED_ACCESSORY);
                    break;
                case true:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONFIGURED_ACCESSORY);
                    optionalOf.isPresent();
                    optionalOf.get();
                    if (acot.u()) {
                        optionalOf = Optional.empty();
                        break;
                    }
                    break;
                default:
                    optionalOf = Optional.of(yxi.USB_TRIGGER_CONNECTED_CONFIGURED_ACCESSORY);
                    break;
            }
            jfz jfzVar = new jfz(context, 10);
            if (true == optionalOf.isPresent()) {
                Object obj = optionalOf.get();
                Context context2 = (Context) jfzVar.a;
                if (Objects.equals(new ldp(context2, jri.a, "car").b(), true)) {
                    return;
                }
                ols.M(context2, (yxi) obj);
            }
        }
    }
}
