.class public final LT8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:LT8/a;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;

.field public static final f:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LT8/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LT8/a;->a:LT8/a;

    .line 7
    .line 8
    const-string v0, "rolloutId"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LT8/a;->b:Lh9/d;

    .line 15
    .line 16
    const-string v0, "parameterKey"

    .line 17
    .line 18
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LT8/a;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "parameterValue"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LT8/a;->d:Lh9/d;

    .line 31
    .line 32
    const-string v0, "variantId"

    .line 33
    .line 34
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LT8/a;->e:Lh9/d;

    .line 39
    .line 40
    const-string v0, "templateVersion"

    .line 41
    .line 42
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LT8/a;->f:Lh9/d;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LT8/m;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, LT8/b;

    .line 6
    .line 7
    iget-object v0, p1, LT8/b;->b:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, LT8/a;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LT8/b;->c:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, LT8/a;->c:Lh9/d;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 19
    .line 20
    .line 21
    sget-object v0, LT8/a;->d:Lh9/d;

    .line 22
    .line 23
    iget-object v1, p1, LT8/b;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 26
    .line 27
    .line 28
    sget-object v0, LT8/a;->e:Lh9/d;

    .line 29
    .line 30
    iget-object v1, p1, LT8/b;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 33
    .line 34
    .line 35
    sget-object v0, LT8/a;->f:Lh9/d;

    .line 36
    .line 37
    iget-wide v1, p1, LT8/b;->f:J

    .line 38
    .line 39
    invoke-interface {p2, v0, v1, v2}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 40
    .line 41
    .line 42
    return-void
.end method
