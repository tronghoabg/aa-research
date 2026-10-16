package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class dsy {
    public dsy() {
    }

    static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Person b(duk dukVar) {
        Person.Builder name = new Person.Builder().setName(dukVar.a);
        IconCompat iconCompat = dukVar.b;
        return name.setIcon(iconCompat != null ? dtj.b(iconCompat, null) : null).setUri(dukVar.c).setKey(dukVar.d).setBot(dukVar.e).setImportant(dukVar.f).build();
    }

    public static duk c(Person person) {
        duj dujVar = new duj();
        dujVar.a = person.getName();
        dujVar.b = person.getIcon() != null ? dtj.d(person.getIcon()) : null;
        dujVar.c = person.getUri();
        dujVar.d = person.getKey();
        dujVar.e = person.isBot();
        dujVar.f = person.isImportant();
        return new duk(dujVar);
    }

    public static IOException e(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? h(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : h(file, iOException);
    }

    public static void g(dsr dsrVar, String str, Executor executor, afdr afdrVar) {
        executor.getClass();
        dsg.w(new fjt(executor, afdrVar, new eqm(fjs.b), 0));
    }

    private static IOException h(File file, IOException iOException) throws IOException {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "]");
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public final fjn f(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(fjn.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                fjn fjnVar = (fjn) objNewInstance;
                if (!fjnVar.d) {
                    return fjnVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                fjo.a();
                Log.e(fjx.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            fjo.a();
            Log.e(fjx.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public dsy(char[] cArr) {
    }
}
