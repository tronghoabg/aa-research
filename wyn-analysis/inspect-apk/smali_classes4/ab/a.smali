.class public abstract Lab/a;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final a:LHf/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {v0}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LHf/e0;

    .line 8
    .line 9
    invoke-direct {v1, v0}, LHf/e0;-><init>(LHf/c0;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lab/a;->a:LHf/e0;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
