.class public abstract Ly3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltc/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltc/j;

    .line 2
    .line 3
    sget-object v1, Ly3/q;->a:Ly3/s;

    .line 4
    .line 5
    invoke-interface {v1}, Ly3/s;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ltc/j;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ly3/p;->a:Ltc/j;

    .line 13
    .line 14
    return-void
.end method
