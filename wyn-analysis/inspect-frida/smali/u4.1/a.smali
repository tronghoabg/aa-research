.class public abstract Lu4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lad/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt4/a;->e:Lad/r;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lt4/a;->a:Ljava/util/Set;

    .line 2
    .line 3
    sget-object v1, Lt4/a;->b:Ljava/util/Set;

    .line 4
    .line 5
    sget-object v2, Lt4/a;->c:Ljava/util/Set;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p0, v3, v0, v1, v2}, Lt4/a;->b(Ljava/lang/Throwable;ZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
