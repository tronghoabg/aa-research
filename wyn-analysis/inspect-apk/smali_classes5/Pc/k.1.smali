.class public final LPc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPc/z;
.implements LPc/u;


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;

.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LPc/k;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LPc/k;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LPc/k;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LPc/k;->d:Ljava/util/HashMap;

    .line 28
    .line 29
    return-void
.end method

.method public static a(LPc/m;)LK8/h;
    .locals 4

    .line 1
    invoke-static {p0}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-object v1, LPc/k;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v2, p0, LPc/m;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, LPc/m;->a:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v3, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, LPc/m;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/util/Map;

    .line 34
    .line 35
    check-cast v0, LK8/e;

    .line 36
    .line 37
    iget-object v1, v0, LK8/e;->b:LK8/U;

    .line 38
    .line 39
    iget-object v1, v1, LK8/U;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    iget-object v1, v0, LK8/e;->b:LK8/U;

    .line 48
    .line 49
    iget-object v1, v1, LK8/U;->a:Ljava/lang/String;

    .line 50
    .line 51
    new-instance v2, LK8/h;

    .line 52
    .line 53
    invoke-direct {v2, v0}, LK8/h;-><init>(LK8/e;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v0, v0, LK8/e;->b:LK8/U;

    .line 60
    .line 61
    iget-object v0, v0, LK8/U;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, LK8/h;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_2
    new-instance p0, LU9/a;

    .line 71
    .line 72
    const-string v0, "No user is signed in"

    .line 73
    .line 74
    invoke-direct {p0, v0}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0
.end method
