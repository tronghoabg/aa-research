.class public final Lnet/zetetic/database/sqlcipher/CloseGuard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/zetetic/database/sqlcipher/CloseGuard$Reporter;,
        Lnet/zetetic/database/sqlcipher/CloseGuard$DefaultReporter;
    }
.end annotation


# static fields
.field public static final b:Lnet/zetetic/database/sqlcipher/CloseGuard;

.field public static volatile c:Lnet/zetetic/database/sqlcipher/CloseGuard$Reporter;


# instance fields
.field public a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/zetetic/database/sqlcipher/CloseGuard;->b:Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lnet/zetetic/database/sqlcipher/CloseGuard;->b:Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Throwable;

    .line 6
    .line 7
    const-string v1, "Explicit termination method \'close\' not called"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/CloseGuard;->a:Ljava/lang/Throwable;

    .line 13
    .line 14
    :cond_0
    return-void
.end method
