package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shi extends defpackage.sts {
    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    @Override // defpackage.sts
    public final void a(android.content.Intent intent) throws xzp {
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("connected", false);
        boolean booleanExtra2 = intent.getBooleanExtra("configured", false);
        boolean booleanExtra3 = intent.getBooleanExtra("accessory", false);
        if (!booleanExtra || !booleanExtra2) {
            z = booleanExtra3;
        } else if (booleanExtra3) {
            return;
        }
        if (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.i == 0 || android.os.SystemClock.elapsedRealtime() - com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.i >= 2000 || !((java.lang.Boolean) com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.j.fF()).booleanValue()) {
            java.util.List list = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a;
            synchronized (list) {
                if (!list.isEmpty()) {
                    com.google.android.gms.carsetup.setup.UsbConnectionHelper.a.f().ai(8931).S("Closing %s FDs due to USB disconnect (connected=%s, configured=%s, accessory=%s)", new defpackage.vqo(list.size()), new defpackage.vqp(booleanExtra), new defpackage.vqp(booleanExtra2), new defpackage.vqp(z));
                }
            }
            try {
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.b();
            } catch (java.io.IOException e) {
                throw new xzp(e);
            }
        }
    }
}
