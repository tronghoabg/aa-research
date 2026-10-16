.class public Lnet/zetetic/database/Logger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lnet/zetetic/database/LogTarget;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/zetetic/database/LogcatTarget;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/zetetic/database/LogcatTarget;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/zetetic/database/Logger;->a:Lnet/zetetic/database/LogTarget;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    invoke-interface {v0, v1, p0, p1, p2}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static b()Lnet/zetetic/database/LogTarget;
    .locals 1

    .line 1
    sget-object v0, Lnet/zetetic/database/Logger;->a:Lnet/zetetic/database/LogTarget;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/zetetic/database/NoopTarget;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/zetetic/database/NoopTarget;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/zetetic/database/Logger;->a:Lnet/zetetic/database/LogTarget;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lnet/zetetic/database/Logger;->a:Lnet/zetetic/database/LogTarget;

    .line 13
    .line 14
    return-object v0
.end method
