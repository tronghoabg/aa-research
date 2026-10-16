.class public abstract Lio/flutter/plugin/platform/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final createArgsCodec:Luc/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luc/n;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luc/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/plugin/platform/f;->createArgsCodec:Luc/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/e;
.end method

.method public final getCreateArgsCodec()Luc/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Luc/n;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->createArgsCodec:Luc/n;

    .line 2
    .line 3
    return-object v0
.end method
