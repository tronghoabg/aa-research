.class public abstract Lmd/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/a;

    .line 2
    .line 3
    const-string v1, "internal:io.grpc.config-selector"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lmd/D;->a:Lmd/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract a()LX2/j;
.end method
