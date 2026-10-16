package defpackage;

import com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class wzg implements Runnable {
    final Socket a;
    final InputStream b;
    final OutputStream c;

    public wzg(Socket socket, InputStream inputStream, OutputStream outputStream) {
        this.a = socket;
        this.b = inputStream;
        this.c = outputStream;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        InputStream inputStream;
        OutputStream outputStream;
        int i;
        try {
            inputStream = this.b;
            try {
                outputStream = this.c;
            } finally {
            }
        } catch (IOException e) {
            ((ype) ((ype) DeveloperHeadUnitNetworkService.a.l().p(e)).ai(9944)).u("Exception in DeveloperHeadUnitNetworkService.ProxyThreadHandler.run");
        }
        try {
            byte[] bArr = new byte[65536];
            while (!this.a.isClosed() && (i = inputStream.read(bArr)) >= 0) {
                if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            try {
                this.a.close();
            } catch (IOException e2) {
                ((ype) ((ype) DeveloperHeadUnitNetworkService.a.l().p(e2)).ai(9943)).u("Exception closing socket.");
            }
        } finally {
        }
    }
}
