package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ozo implements ozm {
    public static final yph a = yph.c("GH.WirelessProxy");
    private static int f = 0;
    public ozp b;
    public ozq c;
    public final Set d;
    public final ajmd e;
    private final Selector g;

    public ozo(Selector selector, List list, ajmd ajmdVar) {
        this.g = selector;
        this.e = ajmdVar;
        this.d = new HashSet(list);
    }

    @Override // defpackage.ozm
    public final void a(ozn oznVar) {
        ((ype) a.l().ai((char) 6250)).y("onClose %s", oznVar);
        d();
    }

    @Override // defpackage.ozm
    public final void b(ozn oznVar, ByteBuffer byteBuffer) {
        ozq ozqVar;
        ozp ozpVar = this.b;
        if (oznVar == ozpVar && (ozqVar = this.c) != null) {
            ozqVar.a(byteBuffer);
        } else {
            if (oznVar != this.c || ozpVar == null) {
                return;
            }
            ozpVar.a(byteBuffer);
        }
    }

    public final ozn c(Class cls, SocketChannel socketChannel) throws ClosedChannelException {
        SelectionKey selectionKeyRegister = socketChannel.register(this.g, 1, this);
        int i = f + 1;
        f = i;
        String str = "-" + i;
        if (ozp.class.equals(cls)) {
            return new ozp("client".concat(str), socketChannel, selectionKeyRegister, this);
        }
        if (ozq.class.equals(cls)) {
            return new ozq("target".concat(str), socketChannel, selectionKeyRegister, this);
        }
        throw new IllegalArgumentException("Unexpected channel type ".concat(cls.toString()));
    }

    final void d() {
        ((ype) a.l().ai((char) 6245)).u("Shutting down");
        ozp ozpVar = this.b;
        if (ozpVar != null) {
            ozpVar.b();
            this.b = null;
        }
        ozq ozqVar = this.c;
        if (ozqVar != null) {
            ozqVar.b();
            this.c = null;
        }
    }
}
