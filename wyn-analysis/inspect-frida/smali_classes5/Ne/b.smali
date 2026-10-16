.class public abstract LNe/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lza/a;

.field public static final b:LA7/z;

.field public static final c:Lx9/d;

.field public static final d:Lya/b;

.field public static final e:LVa/ka;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lza/a;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lza/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LNe/b;->a:Lza/a;

    .line 9
    .line 10
    new-instance v0, LA7/z;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, LA7/z;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LNe/b;->b:LA7/z;

    .line 17
    .line 18
    new-instance v0, Lx9/d;

    .line 19
    .line 20
    const/16 v1, 0x17

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LNe/b;->c:Lx9/d;

    .line 26
    .line 27
    new-instance v0, Lya/b;

    .line 28
    .line 29
    const/16 v1, 0x17

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lya/b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LNe/b;->d:Lya/b;

    .line 35
    .line 36
    new-instance v0, LVa/ka;

    .line 37
    .line 38
    const/16 v1, 0x18

    .line 39
    .line 40
    invoke-direct {v0, v1}, LVa/ka;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v0, LNe/b;->e:LVa/ka;

    .line 44
    .line 45
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static b(ILjava/lang/String;)V
    .locals 2

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " > 0 required but it was "

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
