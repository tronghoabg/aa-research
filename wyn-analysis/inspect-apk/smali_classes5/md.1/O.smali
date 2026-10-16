.class public abstract Lmd/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lmd/a;

.field public static final c:Lmd/j;

.field public static final d:Lmd/a;

.field public static final e:Lmd/a;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/a;

    .line 2
    .line 3
    const-string v1, "internal:health-checking-config"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lmd/O;->b:Lmd/a;

    .line 9
    .line 10
    new-instance v0, Lmd/j;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, v1}, Lmd/j;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lmd/O;->c:Lmd/j;

    .line 17
    .line 18
    new-instance v0, Lmd/a;

    .line 19
    .line 20
    const-string v1, "internal:has-health-check-producer-listener"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lmd/O;->d:Lmd/a;

    .line 26
    .line 27
    new-instance v0, Lmd/a;

    .line 28
    .line 29
    const-string v1, "io.grpc.IS_PETIOLE_POLICY"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lmd/O;->e:Lmd/a;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public a(Lmd/L;)Lmd/k0;
    .locals 4

    .line 1
    iget-object v0, p1, Lmd/L;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmd/O;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "NameResolver returned no usable address. addrs="

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", attrs="

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lmd/L;->b:Lmd/b;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Lmd/O;->c(Lmd/k0;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    iget v0, p0, Lmd/O;->a:I

    .line 50
    .line 51
    add-int/lit8 v1, v0, 0x1

    .line 52
    .line 53
    iput v1, p0, Lmd/O;->a:I

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lmd/O;->d(Lmd/L;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    iput p1, p0, Lmd/O;->a:I

    .line 62
    .line 63
    sget-object p1, Lmd/k0;->e:Lmd/k0;

    .line 64
    .line 65
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract c(Lmd/k0;)V
.end method

.method public d(Lmd/L;)V
    .locals 2

    .line 1
    iget v0, p0, Lmd/O;->a:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lmd/O;->a:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lmd/O;->a(Lmd/L;)Lmd/k0;

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lmd/O;->a:I

    .line 14
    .line 15
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract f()V
.end method
