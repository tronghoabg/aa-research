package com.applovin.shadow.okio;

import Bf.k;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\u0002\u0010\t\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a\u001d\u0010\u0002\u001a\u00020\u0001*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\u001f*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u00012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u001d\u0010$\u001a\u0019\u0010 \u001a\u00020\u001f*\u00020\u00052\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010%\u001a\u0019\u0010)\u001a\u00020&*\u00020&2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010,\u001a\u00020&*\u00020+¢\u0006\u0004\b,\u0010-\u001a%\u0010\u0002\u001a\u00020\u0001*\u00020.2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200¢\u0006\u0004\b\u0002\u00102\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020.2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200¢\u0006\u0004\b\u0006\u00103\"\u001c\u00106\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001c\u0010:\u001a\u00020\f*\u000608j\u0002`98@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ljava/io/OutputStream;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Ljava/io/OutputStream;)Lcom/applovin/shadow/okio/Sink;", "Ljava/io/InputStream;", "Lcom/applovin/shadow/okio/Source;", "source", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Source;", "Ljava/net/Socket;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Source;", "Ljava/io/File;", "", "append", "(Ljava/io/File;Z)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Source;", "Ljavax/crypto/Cipher;", "cipher", "Lcom/applovin/shadow/okio/CipherSink;", "cipherSink", "(Lcom/applovin/shadow/okio/Sink;Ljavax/crypto/Cipher;)Lcom/applovin/shadow/okio/CipherSink;", "Lcom/applovin/shadow/okio/CipherSource;", "cipherSource", "(Lcom/applovin/shadow/okio/Source;Ljavax/crypto/Cipher;)Lcom/applovin/shadow/okio/CipherSource;", "Ljavax/crypto/Mac;", "mac", "Lcom/applovin/shadow/okio/HashingSink;", "hashingSink", "(Lcom/applovin/shadow/okio/Sink;Ljavax/crypto/Mac;)Lcom/applovin/shadow/okio/HashingSink;", "Lcom/applovin/shadow/okio/HashingSource;", "hashingSource", "(Lcom/applovin/shadow/okio/Source;Ljavax/crypto/Mac;)Lcom/applovin/shadow/okio/HashingSource;", "Ljava/security/MessageDigest;", "digest", "(Lcom/applovin/shadow/okio/Sink;Ljava/security/MessageDigest;)Lcom/applovin/shadow/okio/HashingSink;", "(Lcom/applovin/shadow/okio/Source;Ljava/security/MessageDigest;)Lcom/applovin/shadow/okio/HashingSource;", "Lcom/applovin/shadow/okio/FileSystem;", "Lcom/applovin/shadow/okio/Path;", "zipPath", "openZip", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileSystem;", "Ljava/lang/ClassLoader;", "asResourceFileSystem", "(Ljava/lang/ClassLoader;)Lcom/applovin/shadow/okio/FileSystem;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcg/F;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcg/H;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z", "com.applovin.shadow.okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "com/applovin/shadow/okio/Okio")
/* loaded from: classes.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("com.applovin.shadow.okio.Okio");

    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        AbstractC3340k.e(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader) {
        AbstractC3340k.e(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink, @NotNull Cipher cipher) {
        AbstractC3340k.e(sink, "<this>");
        AbstractC3340k.e(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source, @NotNull Cipher cipher) {
        AbstractC3340k.e(source, "<this>");
        AbstractC3340k.e(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        AbstractC3340k.e(sink, "<this>");
        AbstractC3340k.e(mac, "mac");
        return new HashingSink(sink, mac);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull Mac mac) {
        AbstractC3340k.e(source, "<this>");
        AbstractC3340k.e(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        AbstractC3340k.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? k.n0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final FileSystem openZip(@NotNull FileSystem fileSystem, @NotNull Path zipPath) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        AbstractC3340k.e(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z2, int i5, Object obj) throws FileNotFoundException {
        if ((i5 & 1) != 0) {
            z2 = false;
        }
        return Okio.sink(file, z2);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        AbstractC3340k.e(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull MessageDigest digest) {
        AbstractC3340k.e(sink, "<this>");
        AbstractC3340k.e(digest, "digest");
        return new HashingSink(sink, digest);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull MessageDigest digest) {
        AbstractC3340k.e(source, "<this>");
        AbstractC3340k.e(digest, "digest");
        return new HashingSource(source, digest);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        AbstractC3340k.e(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        AbstractC3340k.e(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC3340k.d(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        AbstractC3340k.e(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC3340k.d(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        AbstractC3340k.e(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    @NotNull
    public static final Sink sink(@NotNull File file, boolean z2) throws FileNotFoundException {
        AbstractC3340k.e(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z2));
    }

    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) throws IOException {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC3340k.d(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) throws IOException {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC3340k.d(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }
}
