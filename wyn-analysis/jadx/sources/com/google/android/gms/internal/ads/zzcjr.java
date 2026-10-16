package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
final class zzcjr extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcjs zzb;

    public zzcjr(zzcjs zzcjsVar) {
        Objects.requireNonNull(zzcjsVar);
        this.zzb = zzcjsVar;
        this.zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcjs zzcjsVar = this.zzb;
        if (zzcjsVar.zzm() > 0) {
            socket.setReceiveBufferSize(zzcjsVar.zzm());
        }
        zzcjsVar.zzl(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i5) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i5);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i5, InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i5, inetAddress, i10);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i5);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i10) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i5, inetAddress2, i10);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i5, boolean z2) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(socket, str, i5, z2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }
}
