package defpackage;

import android.bluetooth.BluetoothSocket;
import android.os.Build;
import android.os.Looper;
import java.io.IOException;

/* loaded from: classes2.dex */
public class phq extends pho {
    public static final /* synthetic */ int d = 0;
    private static final yph e = yph.c("GH.WPP.RFCOMM");
    private final xyc f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, paa] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xyc] */
    public phq(gkc gkcVar) {
        long j;
        Object obj = gkcVar.d;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ((ype) ((ype) e.f()).ai(6709)).B("IO stream will sleep for %d ms instead of flushing after each write.  SDK: %d", 10, i);
            j = 10;
        } else {
            ((ype) ((ype) e.f()).ai((char) 6708)).u("IO stream will flush after each write");
            j = -1;
        }
        super((Looper) obj, j, gkcVar.b);
        this.f = wub.L(gkcVar.c);
    }

    private final BluetoothSocket i() throws IOException {
        return (BluetoothSocket) this.f.gu();
    }

    @Override // defpackage.pho
    protected tgu e() throws IOException {
        ((ype) ((ype) e.f()).ai((char) 6705)).u("Connecting the socket");
        i().connect();
        if (koo.n()) {
            BluetoothSocket bluetoothSocketI = i();
            return jxc.g(bluetoothSocketI.getInputStream(), bluetoothSocketI.getOutputStream(), bluetoothSocketI, par.WPP_READ, par.WPP_WRITE);
        }
        BluetoothSocket bluetoothSocketI2 = i();
        return new tgv(bluetoothSocketI2, bluetoothSocketI2.getInputStream(), bluetoothSocketI2.getOutputStream());
    }

    @Override // defpackage.pho
    protected final void g() throws IOException {
        ((ype) ((ype) e.f()).ai((char) 6706)).u("Closing the socket");
        try {
            i().close();
        } catch (IOException e2) {
            ((ype) ((ype) ((ype) e.h()).p(e2)).ai((char) 6707)).u("Failed to close the socket, ignoring");
        }
    }
}
